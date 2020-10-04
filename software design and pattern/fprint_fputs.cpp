#include<stdio.h>
int main() {
	FILE *fp;
	char buff[255];
	fp = fopen("test.txt", "r");

	fscanf(fp, "%s", buff);
	printf("1:%s\n", buff);
	fgets(buff, 255, (FILE*)fp);//포인터가 뒤로 가서 this가 짤리고 나옴
	printf("2:%s\n", buff);
	fgets(buff, 255, (FILE*)fp);
	printf("3:%s\n", buff);
	fclose(fp);
}