#include <stdio.h>
int main() {
	int a[5] = { 1,2,3,4,5 };
	int* aP;
	aP = a;
	//ap�� a[]�� �ּҸ� ����Ű�� a[]���� �����͸� ����ϵ��� ���α׷���

	for (int i = 0; i < 5; i++) {
		printf("%d\n", a[i]);//��
		printf("%d\n", aP[i]);//��
		printf("%d\n", *(a + i));//��
		printf("%d\n", (aP + i));//�ּ�
	}
	return 0;
}