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
		if (buffer[0] == '\0')//���͸� ������ ���α׷� ����
			break;
		p = (NODE *)malloc(sizeof(NODE));
		strcpy(p->title, buffer);
		printf("year: ");
		gets_s(buffer, sizeof(int) + 1);
		year = atoi(buffer);//���ڸ� ���ڷ� ��ȯ
		p->year = year;
		if (list == NULL) 	// ����Ʈ�� ��� ������ 		
			list = p;	// ���ο� ��带 ù��° ���� �����.
		else		// ����Ʈ�� ��� ���� ������
			prev->link = p;// ���ο� ��带 ���� ����� ����
		p->link = NULL;	// ���ο� ����� ��ũ �ʵ带 NULL�� ����
		prev = p;
	}

	printf("\n");
	// ���� ����Ʈ�� ��� �ִ� ������ ��� ����Ѵ�.
	p = list;
	while (p != NULL)
	{
		printf("title:%s  \t year:%d \n", p->title, p->year);
		p = p->link;
	}
	// ���� �Ҵ��� �ݳ��Ѵ�.	
	p = list;
	while (p != NULL)
	{
		next = p->link;
		free(p);
		p = next;
	}
	return 0;
}