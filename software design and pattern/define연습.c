#include<stdio.h>

#define USA
#ifndef PI
#define PI 3.14
#endif//pi가 정의되어있지않으면 pi를 정의
#define SQUARE(x)(PI*(x)*(x))

int main() {
	double r;
#ifdef USA
	printf("input r\n");
	scanf("%lf", &r);
	printf("square is %lf", SQUARE(r)); 
#else
	printf("입력\n");
	scanf("%lf", &r);
	printf("넓이는 %lf", SQUARE(r));
#endif
	return 0;

}