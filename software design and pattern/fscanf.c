#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
	int i;
	fscanf(stdin, "%d", &i);
	fprintf(stdout, "%d", i);
	fprintf(stderr, "this file name error\n");
	//fscanf�� fprintf�� �Է°� ����غ��� 

}
