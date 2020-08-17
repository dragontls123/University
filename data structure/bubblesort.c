#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include<time.h>
#define SIZE 10000
int main() {
	int temp;	
	int a[SIZE];
	clock_t start, end;

	for (int i = 0; i < SIZE; i++) {
		a[i] = rand()%10000+1;
	}
	start = clock();
	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; SIZE - (j + 1); j++) {
			if (a[j] > a[j + 1]) {
				temp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = temp;
			}
		}
	}
	end = clock();
	printf("%f", (double)(end - start)/1000);

}