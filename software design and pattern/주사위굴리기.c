#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
	int num, i, t;
	int n[100] = {};
	float d[6] = { 0, };

	printf("how many times do you want to roll a dice\n");
	scanf("%d", &num);
	srand(time(NULL));
	for (i = 1; i <= num; i++) {
		n[i] = rand();
		t = (n[i] % 6)+1;
		switch (t) {
		case 1: d[0]++; break;
		case 2: d[1]++; break;
		case 3: d[2]++; break;
		case 4: d[3]++; break;
		case 5: d[4]++; break;
		case 6: d[5]++; break;
		}

	}
	float sum = 0;
	for (int t = 0; t < 6; t++) {
		printf("dice:[%d] : Dice#%d , frequncy = %.2f , probability = %.2f\n",t, t+1, d[t], d[t] / (float)num);
		sum += (t + 1)*d[t];
	}
	printf("sum : %.2f\naverage number : %.2f", sum, sum / (float)num);
	
	
}	