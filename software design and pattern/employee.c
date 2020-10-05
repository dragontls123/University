#include <stdio.h>
#include <string.h>
// 직원
struct employee {
	int number; // 사번
	char name[20]; // 이름
	int age; // 나이
	char tel[20]; // 전화번호
};
int main(void)
{
	int s = 0;
	printf("몇 명을 입력합니까?");
	scanf("%d", &s);//몇 개의 데이터를 입력받을지
	struct employee e[5];
	for (int j = 0; j < s; j++) {
		printf("사번");
		scanf("%d", &e[j].number);
		printf("이름");
		scanf("%s", &e[j].name);
		printf("나이");
		scanf("%d", &e[j].age);
		printf("전화번호");
		scanf("%s", &e[j].tel);
	}
	printf("\n\n");

	int i;
	int a=0;
	int t = 0;
	for (i = 0; i < s; i++)
		if (e[i].age >= 30 && e[i].age <= 39) {
			printf("[%d]", i);
			printf("사번:%d\n", e[i].number);
			printf("이름:%s\n", e[i].name);
			printf("나이:%d\n", e[i].age);
			printf("전화번호:%s\n", e[i].tel);
			a += e[i].age;
			t++;
		}
	printf("평균=%.2f",(float)(a/t));
	return 0;
}//5명 미만의 직원의 정보를 입력받은 후 30대 직원의 평균 연령 구하기