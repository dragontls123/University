#include<stdio.h>

#define USA
#ifndef PI
#define PI 3.14
#endif//pi�� ���ǵǾ����������� pi�� ����
#define SQUARE(x)(PI*(x)*(x))

int main() {
	double r;
#ifdef USA
	printf("input r\n");
	scanf("%lf", &r);
	printf("square is %lf", SQUARE(r)); 
#else
	printf("�Է�\n");
	scanf("%lf", &r);
	printf("���̴� %lf", SQUARE(r));
#endif
	return 0;

}