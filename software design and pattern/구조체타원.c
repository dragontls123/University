#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
struct circle {
	int d;
	float x, y;
	char color[15];
};
//main �Լ����� ������ ���� �Է¹޾� ���
int main() {
	struct circle c;
	strcpy(c.color, "red");
	scanf_s("%d", &c.d);
	scanf_s("%f", &c.x);
	scanf_s("%f", &c.y);
	
	printf("������:%d\n", c.d);
	printf("x��ǥ:%f\n", c.x);
	printf("y��ǥ:%f\n", c.y);
	printf("%s\n", c.color);
	
}