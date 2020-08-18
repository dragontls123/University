#include <stdio.h>
#include <time.h>
#include <stdlib.h>

bool cntPrime(int num)
	{
		int cnt = 0;
		int i;
		if (num < 2) 
			return false;

		for (i = 1; i*i < num; i++) {
			if (num%i == 0) cnt++;
		}
		if (i*i == num) cnt++;
		if (cnt == 1) 
			{
			return true;}
		else 
			return false;

	}

int main(int argc, char* argv[]) {
	clock_t begin_time = clock();
	int num = atoi(argv[1]);
	int total=0;

//cntPrime(num);
for(int t=0;t<=num;t++){
if(cntPrime(t))total++;
}
	clock_t end_time = clock();


	double elapsed_time = (double)( end_time - begin_time) / CLOCKS_PER_SEC;

	printf("elapsed time: %f sec \n", elapsed_time);
	printf("The number of pirme numbers between 1~%d is %d", num,total);

	return 0;
}
