#include <stdio.h>
#include <math.h>
#include<string.h>
#include<stdlib.h>

struct contact {
	char name[100];
	char home_phone[100];
	char cell_phone[100];
};
int main(void)
{
	struct contact list[5];
	int i;
	int t = 0;
	char name[100];
	for (i = 0; i < 5; i++) {
		printf("이름을 입력하시오:");
		scanf("%s", list[i].name);
		printf("집전화번호를 입력하시오:");
		scanf("%s", list[i].home_phone);
		printf("휴대폰번호를 입력하시오:");
		scanf("%s", list[i].cell_phone);
	}
	printf("검색할 이름을 입력하시오:");
	scanf("%s", name);
	for (i = 0; i < 5; i++) {
		if (strcmp(name, list[i].name) == 0) {
			printf("집전화번호: %s\n", list[i].home_phone);
			printf("휴대폰번호: %s\n", list[i].cell_phone);
			printf("---------------------\n");
			t++;
//동일인검색불가
		}
		
	}
	if (t == 0)
		printf("검색이 실패하였슴\n");


}