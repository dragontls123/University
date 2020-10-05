#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
	int total = 0;//몇 개 있는지 저장
	char *a;
	char *aa;

	char *result = NULL;
	a = (char*)malloc(sizeof(char) * 100);
	aa = (char*)malloc(sizeof(char) * 100);
	printf("문자열 입력\n");
	gets_s(a, 100);
	printf("찾을 문자열\n");
	gets_s(aa, 100);
	result = strstr(a, aa);
	while (result != NULL) {	
		total++;
		result = strstr(result + 1, aa);
	}	
	printf("%d개 존재",total);
	return 0;
}