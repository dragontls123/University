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
	//�����ͺ����� ����Ǿ��� ��� �ݵ�� �迭ó�� ����� �����ϴ�. 
	//�迭�� ���������� ������ ����ó�� ����� ����
	for (int i = 0; i < 10; i++)
		printf("%d", nums[i]);
	free(nums);
	
}