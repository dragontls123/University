#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<string.h>

struct course {
	char subj[20];	//�����
	char pro[10];	//������ ����
	int room;	//���ǽ� ȣ��
};

int main(void)
{
	int menu;
	char menu2[20];
	int i = 5;

	struct course c[20] = {
	{ "����Ʈ���������","�ο���",304 },
	{ "Ȯ�����", "�����", 305 },
	{ "�κ�����", "�����", 601 },
	{ "����Ʈ������ ���°�", "����ȯ", 304 },
	{ "�л�ý���", "Ȳȿ��", 410 },
	};

	
	while (1)
	{
		printf("-------------------------------\n");
		printf("|�޴��� ���ÿ�.             |\n");
		printf("|  (1)�߰� (2)�˻� (3)������  |\n");
		printf("-------------------------------\n");

		printf("��ȣ �Է�: ");
		scanf("%d", &menu);

		switch (menu)
		{
		case 1:
			//����ü ���� ���� ����

			//����� �Է¹ޱ�
			printf("\n�����: ");
			scanf("%s", c[i].subj);
			printf("������: ");
			scanf("%s", c[i].pro);
			printf("���ǽ�: ");
			scanf("%d", &c[i].room);
			i++;

			printf("\n**�߰� �Ϸ�!**\n\n");

			break;

		case 2:
			printf("\n������ ������ �Է��Ͻÿ� : ");
			scanf("%s", menu2);

			printf("\n-----------��� ���-----------\n");
			for (int j = 0; j < sizeof(c) / sizeof(c[0]); j++)
			{
				if (strcmp(c[j].pro, menu2) == 0)
				{
					printf("�����: %s\n", c[j].subj);
					printf("������: %s\n", c[j].pro);
					printf("���ǽ�: %d\n\n", c[j].room);
				}
			}

			break;

		case 3:
			printf("���α׷� ����\n");
			return 0;
		}
	}

	return 0;
}

