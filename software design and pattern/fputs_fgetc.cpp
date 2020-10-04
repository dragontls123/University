#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	FILE *fp = NULL;
	int c;
	fp = fopen("sample2.txt", "w");
	fputs("good morning", fp);
	fclose(fp);

	fp = fopen("sample2.txt", "r");
	while (!feof(fp) ){
		c=fgetc(fp);
		printf("%c", c);
		
	}
	fclose(fp);
	return 0;
}