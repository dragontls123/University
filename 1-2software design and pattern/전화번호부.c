#include <stdio.h>
#include <math.h>
#include<string.h>
#include<stdlib.h>

struct contact {
	char name[100];
	char home_phone[100];
	char cell_phone[100];
};
int main(void)
{
	struct contact list[5];
	int i;
	int t = 0;
	char name[100];
	for (i = 0; i < 5; i++) {
		printf("�̸��� �Է��Ͻÿ�:");
		scanf("%s", list[i].name);
		printf("����ȭ��ȣ�� �Է��Ͻÿ�:");
		scanf("%s", list[i].home_phone);
		printf("�޴�����ȣ�� �Է��Ͻÿ�:");
		scanf("%s", list[i].cell_phone);
	}
	printf("�˻��� �̸��� �Է��Ͻÿ�:");
	scanf("%s", name);
	for (i = 0; i < 5; i++) {
		if (strcmp(name, list[i].name) == 0) {
			printf("����ȭ��ȣ: %s\n", list[i].home_phone);
			printf("�޴�����ȣ: %s\n", list[i].cell_phone);
			printf("---------------------\n");
			t++;
//�����ΰ˻��Ұ�
		}
		
	}
	if (t == 0)
		printf("�˻��� �����Ͽ���\n");


}