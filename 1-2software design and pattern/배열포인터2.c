#include <stdio.h>
int main() {
	int a[5] = { 1,2,3,4,5 };
	int* aP;
	aP = a;
	//ap가 a[]의 주소를 가르키고 a[]안의 데이터를 출력하도록 프로그래밍

	for (int i = 0; i < 5; i++) {
		printf("%d\n", a[i]);//값
		printf("%d\n", aP[i]);//값
		printf("%d\n", *(a + i));//값
		printf("%d\n", (aP + i));//주소
	}
	return 0;
}