#include<stdio.h>
#include<stdlib.h>
#include <string.h>
#define SIZE 5
typedef struct candi {
	char region[10];
	int age;
	char candidate[10];
}candi;
void main()
{
	candi person[10], person2[10], person3[10];
	candi temp1, temp2, temp3;
	int i, j, k;
	int a, b, c, errorc;
	a = b = c = errorc = 0;
	FILE  *fp;
	fp = fopen("vote.txt", "rb");
	if (fp == NULL) {
		printf("error");
		exit(1);
	}

	for (i = 0; i < 3; i++) {
		fscanf(fp, "%s %d %s\n", person[i].region, &person[i].age, person[i].candidate);
		printf("%s %d %s\n", person[i].region, person[i].age, person[i].candidate);
	}

	/* what is printed?
	fread(person, sizeof(candi), 3, fp);
	for (i = 0; i < 3; i++) {
		printf("%s \t %d \t %s\n", person[i].region, person[i].age, person[i].candidate);
	}*/

	for (int i = 0; i < 3; i++) {
		//what's ' printed?
		if((person[i].candidate)== "A") a++;
		

	/*	if (strcmp(person[i].candidate, "A") == 0)a++;
		else if (strcmp(person[i].candidate, "B") == 0)b++;
		else if (strcmp(person[i].candidate, "C") == 0)c++;
		else errorc++;
*/
	}

	printf("a=%d b=%d c=%d error=%d\n", a, b, c, errorc);

	fclose(fp);

}

