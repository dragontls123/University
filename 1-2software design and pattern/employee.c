#include <stdio.h>
#include <string.h>
// ����
struct employee {
	int number; // ���
	char name[20]; // �̸�
	int age; // ����
	char tel[20]; // ��ȭ��ȣ
};
int main(void)
{
	int s = 0;
	printf("�� ���� �Է��մϱ�?");
	scanf("%d", &s);//�� ���� �����͸� �Է¹�����
	struct employee e[5];
	for (int j = 0; j < s; j++) {
		printf("���");
		scanf("%d", &e[j].number);
		printf("�̸�");
		scanf("%s", &e[j].name);
		printf("����");
		scanf("%d", &e[j].age);
		printf("��ȭ��ȣ");
		scanf("%s", &e[j].tel);
	}
	printf("\n\n");

	int i;
	int a=0;
	int t = 0;
	for (i = 0; i < s; i++)
		if (e[i].age >= 30 && e[i].age <= 39) {
			printf("[%d]", i);
			printf("���:%d\n", e[i].number);
			printf("�̸�:%s\n", e[i].name);
			printf("����:%d\n", e[i].age);
			printf("��ȭ��ȣ:%s\n", e[i].tel);
			a += e[i].age;
			t++;
		}
	printf("���=%.2f",(float)(a/t));
	return 0;
}//5�� �̸��� ������ ������ �Է¹��� �� 30�� ������ ��� ���� ���ϱ�