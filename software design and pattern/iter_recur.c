#include<stdio.h>

int recur(int n) {
	
	if (n > 1) {
		for (int i = n; i > 0; i--) {
				printf("%d", n-i+1);
		}
		printf("\n");
		recur(n - 1);
	}
	else if (n==1)
		printf("1");
	return 0;
}
int iter(int n){	
	for (int i = n; i >0; i--){
		for (int j = 0; j < i; j++) {
		printf("%d", j+1);
		}
		printf("\n");
		}
		return 0;
}

int main() {
	printf("recursive\n");
	recur(10);
	printf("\n\n");
	printf("iter\n");
	iter(10);
}