#include <stdio.h>
#include <string.h>
#include <stdlib.h>>
struct email {
	char title[100];
	char receiver[50];
	char sender[50];
	char content[1000];
	char date[100];
	int priority;
};
int main(void)
{
	struct email e;
	//strcpy(e.title, "안부 메일");
	printf("title:\n");
	scanf_s("%s", e.title,sizeof(e.title));
	//strcpy(e.receiver, "chulsoo@hankuk.ac.kr");
	printf("receiver:\n");
	scanf_s("%s", e.receiver, sizeof(e.receiver));
	//strcpy(e.sender, "hsh@hankuk.ac.kr");
	printf("sender:\n");
	scanf_s("%s", e.sender, sizeof(e.sender));
	//strcpy(e.content, "안녕하십니까? 별일 없으신지요?");
	printf("content:\n");
	scanf_s("%s", e.content, sizeof(e.content));
	getchar();
	getchar();
	//strcpy(e.date, "2018/9/1");
	printf("date:\n");
	scanf_s("%s",e.date, sizeof(e.receiver));
	e.priority = 1;
	printf("%s\n %s\n %s\n %s\n %s\n %d\n", e.title, e.receiver, e.sender,
		e.content, e.date, e.priority);
	system("pause");
	getchar();
	return 0;
}