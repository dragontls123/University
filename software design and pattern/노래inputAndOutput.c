#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct song {
	char name[25];
	float length;
	int id;
};

int main() {
	int i = 2;//�ʱ��Էµ� ����
	int si;//3���� ����
	int insert;//����ġ
	struct song s1[20] = { 
	{ "song",1.1,1 },
	{"songsong",2.2,2}};
	while (1) {	
		printf("\n1.insert 2.print 3.search 4.exit\n");
		scanf("%d", &insert);
		switch (insert)
		{case 1://�μ�Ʈ
			printf("song name");//�뷡 �Է�
			scanf_s("%s",s1[i].name,sizeof(s1[0].name));//�뷡 �ޱ�
			printf("length\n");//���� �Է�
			scanf_s("%f", &s1[i].length, sizeof(s1[0].length));//���̹ޱ�
			printf("id\n");//���̵� �Է�
			scanf_s("%d", &s1[i].id, sizeof(s1[0].id));//���̵� �ޱ�
			i++;
			break;

		case 2://����Ʈ
			for (int tt = 0; tt < i; tt++)
				printf("id=%d, length=%f, name=%s\n", s1[tt].id, s1[tt].length, s1[tt].name);
			break;

		case 3://�˻�
			printf("id�Է�");
			scanf("%d", &si);

			for (int t = 0; t < sizeof(s1) / sizeof(s1[0]); t++) {
				if (si == s1[t].id) {
					printf("id=%d, length=%f, name=%s\n", s1[t].id, s1[t].length, s1[t].name);
				}
			}
			break;

		case 4: //������
			return 0;
	
		}
	}
	
	
}