#include<stdio.h>

int main() {
	int count = 0;
	int t;
	int sum = 0;
	int input = 0;
	FILE*fp = fopen("1.txt", "w");
	for (int i = 0; i < 15; i++) {
		printf("%d��° �Է��Ͻÿ�", i+1);
		scanf("%d", &input);
		fprintf(fp,"%d\n",input);
	}
	fclose(fp);
	FILE*fpp = fopen("1.txt", "r");
	for (int i = 0; i < 15; i++) {
		fscanf(fpp, "%d", &t);
		sum += t;
		if (t < 60) {
			count++;
		}
	}
	printf("avg:%d\n",sum/15);
	printf("����:%d\n", count);
	fclose(fpp);
}