#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <malloc.h>
#include <pthread.h>
#define NUMBER_OF_THREAD 10
int num_per_thread;
int total=0;

bool cntPrime(int num)
	{
		int cnt = 0;
		int i;
		if (num < 2) 
			return false;

		for (i = 1; i*i < num; i++) {
			if (num%i == 0) cnt++;
		}
		if (i*i == num) cnt++;
		if (cnt == 1) 
			{
			return true;}
		else 
			return false;

	}
void* run_thread ( void *first){//created by pthread_create();
  bool check;
  int prime_cnt = 0;
  int start_num = *(int*)first;

  for(int i = start_num; i < start_num + num_per_thread; i++){
    if(cntPrime(i)) {
      prime_cnt++;
    }

  }
 // printf("prime_cnt each of thread : %d\n", prime_cnt);
  total += prime_cnt;
  pthread_exit(0);
}

int main(int argc, char* argv[]) {

	int num = atoi(argv[1]);
	int status;
	pthread_t p_thread[NUMBER_OF_THREAD];//array	
	num_per_thread=num/NUMBER_OF_THREAD;
	int thr_id;
	int temp=num/NUMBER_OF_THREAD;
	struct timespec start, finish;
	double elapsed;

int k = 0;

int i[10] = {0, 0 + num_per_thread, 0 + num_per_thread * 2, 0 + num_per_thread * 3,
    0 + num_per_thread * 4, 0 + num_per_thread * 5, 0 + num_per_thread * 6, 0 + num_per_thread * 7,
    0 + num_per_thread * 8, 0 + num_per_thread * 9};


	clock_gettime(CLOCK_MONOTONIC, &start);//start

  	for(int m = 0; m < NUMBER_OF_THREAD; k += num_per_thread, m++){//create
//    	printf("make thread No.%d : %d & value of i : %d\n",m, k, i[m]);
    		if(pthread_create(&p_thread[m], NULL, run_thread, (void *) &i[m]) < 0) {
   		perror("thread create error:");
        	exit(0);
    		}
  	}
 
 	for(int i = 0; i < 10; i++){
 	   pthread_join(p_thread[i], NULL);
  	}

  	clock_gettime(CLOCK_MONOTONIC, &finish);//finish

	


	
	elapsed=(finish.tv_sec-start.tv_sec);
	elapsed+=(finish.tv_nsec-start.tv_nsec)/1000000000.0; 
	
	
	printf("elapsed time: %f sec \n", elapsed);
	printf("The number of pirme numbers between 1~%d is %d", num,total);

	return 0;
}
