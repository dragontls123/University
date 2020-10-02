#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define S_SIZE 20

typedef struct NODE {
	char title[20];
	int year;
	struct NODE *link;
} NODE;

int main(void)
{
	NODE *list = NULL;
	NODE *prev, *p, *next;
	char buffer[S_SIZE];
	int year;


	while (1) {
		printf("title : (exit , enter)");
		gets_s(buffer, 20);
		if (buffer[0] == '\0')//엔터를 누르면 프로그램 종료
			break;
		p = (NODE *)malloc(sizeof(NODE));
		strcpy(p->title, buffer);
		printf("year: ");
		gets_s(buffer, sizeof(int) + 1);
		year = atoi(buffer);//문자를 숫자로 변환
		p->year = year;
		if (list == NULL) 	// 리스트가 비어 있으면 		
			list = p;	// 새로운 노드를 첫번째 노드로 만든다.
		else		// 리스트가 비어 있지 않으면
			prev->link = p;// 새로운 노드를 이전 노드의 끝에
		p->link = NULL;	// 새로운 노드의 링크 필드를 NULL로 설정
		prev = p;
	}

	printf("\n");
	// 연결 리스트에 들어 있는 정보를 모두 출력한다.
	p = list;
	while (p != NULL)
	{
		printf("title:%s  \t year:%d \n", p->title, p->year);
		p = p->link;
	}
	// 동적 할당을 반납한다.	
	p = list;
	while (p != NULL)
	{
		next = p->link;
		free(p);
		p = next;
	}
	return 0;
}