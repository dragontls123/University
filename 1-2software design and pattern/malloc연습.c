#include<stdio.h>
#include<stdlib.h>

int main() {
	int *nums;
	nums = (int*)malloc(sizeof(nums) * 10);
	if (nums == NULL) {
		printf("dynamic allocation error");
		exit(1);
	}
	for (int i = 0; i < 10; i++)
	//	scanf("%d", &nums[i]);
	scanf("%d", (nums+i));
	//포인터변수로 선언되었을 경우 반드시 배열처럼 사용이 가능하다. 
	//배열도 마찬가지로 포인터 변수처럼 사용이 가능
	for (int i = 0; i < 10; i++)
		printf("%d", nums[i]);
	free(nums);
	
}