#include <stdio.h>
#include<time.h>
#include<stdlib.h>
int main() {
	int a[100000];
	srand(time(NULL));
	clock_t st, end;
	st = clock();
	for (int i = 0; i < 100000; i++) {
		a[i] = rand()%100000;
	}
	end = clock();
	printf("%lf", ((double)end - st)/1000);
	return 0;
}