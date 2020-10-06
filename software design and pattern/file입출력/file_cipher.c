#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	int num = 0;
	int n = 0;
	char c[100] = { 0, };
	char a[100] = { 0, };
	FILE *f = fopen("original.txt", "r");
	FILE *ff = fopen("cypher.txt", "w");
	if (f == NULL || ff == NULL) {
		exit(-1);
	}

	fscanf(f,"%s",c );
	printf("enter number");
	scanf("%d", &n);
	num = n % 26;
	int len = strlen(c);

	for (int i = 0; i < len; i++) {	 
	if (c[i]>='A' && c[i]<= 'Z') {
        if (c[i]+num > 'Z') 
		a[i] = (c[i]+num-('Z'-'A'+1));
        else a[i] = c[i]+num;
    }
	 else if (c[i]>='a' && c[i]<= 'z'){
	if (c[i] + num > 'z') 
				a[i] = (c[i] + num - ('z' - 'a' + 1));
			else a[i] = c[i] + num;
	}
	}
	fprintf(ff,"%s", a);
	fclose(f);
	fclose(ff);

	FILE*fff = fopen("cypher.txt", "r");
	FILE*ffff = fopen("decrypted.txt", "w");
	if (fff == NULL || ffff == NULL) {
		exit(-1);
	}
	char cc[100] = { 0, };
	char aa[100] = { 0, };
	fscanf(fff, "%s", cc);
	
	for (int i = 0; i < len; i++) {
		if (cc[i] >= 'A' && cc[i] <= 'Z') {
			if (cc[i] - num < 'A')
				aa[i] = (cc[i] - num + ('Z' - 'A' + 1));
			else aa[i] = cc[i] - num;
		}
		else if (cc[i] >= 'a' && cc[i] <= 'z') {
			if (cc[i] - num < 'a')
				aa[i] = (cc[i] - num + ('z' - 'a' + 1));
			else aa[i] = cc[i] - num;
		}
	}
	fprintf(ffff, "%s", aa);
	fclose(fff);
	fclose(ffff);

	char tt[100] = { 0, };
	char ttt[100] = { 0, };
	FILE*ffffff = fopen("original.txt", "r");
	FILE*fffff = fopen("decrypted.txt", "r");
	fscanf(ffffff, "%s", tt);
	fscanf(fffff, "%s", ttt);
	printf("decrypted.txt: %s\n", ttt);
	printf("original.txt: %s\n", tt);
	fclose(fffff);
	fclose(ffffff);
}