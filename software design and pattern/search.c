#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main() {
	int total = 0;//�� �� �ִ��� ����
	char *a;
	char *aa;

	char *result = NULL;
	a = (char*)malloc(sizeof(char) * 100);
	aa = (char*)malloc(sizeof(char) * 100);
	printf("���ڿ� �Է�\n");
	gets_s(a, 100);
	printf("ã�� ���ڿ�\n");
	gets_s(aa, 100);
	result = strstr(a, aa);
	while (result != NULL) {	
		total++;
		result = strstr(result + 1, aa);
	}	
	printf("%d�� ����",total);
	return 0;
}