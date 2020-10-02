#include <stdio.h>
#include <stdlib.h>
typedef struct book {
	int number;
	char title[20];
}Book;//(가) struct Book (int number, char title[20])을 typdef로 Book으로 선언하기 


int main(void)
{
	Book *p;

	p = (Book*)malloc(sizeof(Book) * 2);//(나) malloc으로 구조체의 배열 선언하기 (2개)

		if (p == NULL) {
			printf("메모리 할당 오류\n");
			exit(1);
		}

		for (int i = 0; i < 2; i++)
		{
			scanf("%d", &p[i].number);
			getchar();
			gets_s(p[i].title,20);
			//scanf는 space를 입력하면 space앞까지만 입력됨
		}	
		for (int i = 0; i < 2; i++)
		{
			printf("p[%d]:%d",i, p[i].number);
			printf("p[%d]%s\n",i, p[i].title);
		}///(다) 값 입력받고, 출력하기 

	free(p);
	return 0;
}
