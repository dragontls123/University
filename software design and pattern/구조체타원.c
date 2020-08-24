#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
struct circle {
	int d;
	float x, y;
	char color[15];
};
//main 함수에서 각각의 값을 입력받아 출력
int main() {
	struct circle c;
	strcpy(c.color, "red");
	scanf_s("%d", &c.d);
	scanf_s("%f", &c.x);
	scanf_s("%f", &c.y);
	
	printf("반지름:%d\n", c.d);
	printf("x좌표:%f\n", c.x);
	printf("y좌표:%f\n", c.y);
	printf("%s\n", c.color);
	
}