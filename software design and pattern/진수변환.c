#include<stdio.h>
#include<math.h>

int main() {
	int i;
	int j = 0;
	printf("��?");
	scanf("%d", &i);
	int temp[10] = {0,};
	int d;
	printf("�������� ��ȯ?");
	scanf("%d", &d);
	while (i > 0) {
		temp[j] = i % d;
		i = i / d;
		++j;
	}
	for (int t = j-1; t>=0; t--) {
		printf("%d", temp[t]);
	}
}