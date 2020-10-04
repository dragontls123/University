#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define size 3

struct st {
	int i;
	char a[10];
};

int main() {
	struct st table[size]{
		{1,"kim"},{2,"hong"},{3,"s"}
	};
	struct st s;
	FILE *fp;
	fp=fopen("temp.dat", "wb");
	if (fp == NULL) {
		printf("error");
		fprintf(stderr, "can't open file");
		exit(1);
	}
	fwrite(table, sizeof(struct st), size, fp);
	fclose(fp);
	fp = fopen("temp.dat", "r");
	
	for (int t = 0; t < size; t++) {
		fread(&s, sizeof(struct st), 1, fp);
		printf("%d¹øÂ° number=%d, name=%s\n", t + 1, s.i, s.a);
	}
	fclose(fp);
}