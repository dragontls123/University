#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>
#include <wait.h>
#include <stdlib.h>

int main() {
  pid_t pid1, pid2;
  mkfifo("/tmp/hw3_fifo_son", 0666);
  mkfifo("/tmp/hw3_fifo_dau", 0666);

  int fd1 = open("/tmp/hw3_fifo_son", O_RDONLY);
  int fd2 = open("/tmp/hw3_fifo_dau", O_RDONLY);

  pid1 = fork();

  if(pid1 < 0) {/*error occurred*/
    fprintf(stderr,"Fork Failed");
    return 1;
  }
  else if(pid1 == 0){/*son process*/
    fprintf(stdout,"son process create.\n");
    char buffer[1024];
    while (1) {
      read(fd1, buffer, sizeof(buffer));
      if(buffer[0] == '0'){
        break;
      }
      fprintf(stdout,"son receives : %s\n", buffer);
    }
  }
  else{/*parent process*/

    pid2 = fork();
    if(pid2 < 0) {//error occurred
      fprintf(stderr,"Fork Failed");
      return 1;
    }
    else if(pid2 == 0){//daughter process
      fprintf(stdout,"daughter process create.\n");
      char buffer[1024];
      while (1) {
        read(fd2, buffer, sizeof(buffer));
        if(buffer[0] == '0'){

          break;
        }
        fprintf(stdout,"daugther receives : %s\n", buffer);
      }
    }
    wait(NULL);
    close(fd1);
    close(fd2);
  }
  unlink("/tmp/hw3_fifo_son");
  unlink("/tmp/hw3_fifo_dau");
  return 0;

}
