#include <stdio.h>
#include <stdlib.h>
typedef struct book {
	int number;
	char title[20];
}Book;//(��) struct Book (int number, char title[20])�� typdef�� Book���� �����ϱ� 


int main(void)
{
	Book *p;

	p = (Book*)malloc(sizeof(Book) * 2);//(��) malloc���� ����ü�� �迭 �����ϱ� (2��)

		if (p == NULL) {
			printf("�޸� �Ҵ� ����\n");
			exit(1);
		}

		for (int i = 0; i < 2; i++)
		{
			scanf("%d", &p[i].number);
			getchar();
			gets_s(p[i].title,20);
			//scanf�� space�� �Է��ϸ� space�ձ����� �Էµ�
		}	
		for (int i = 0; i < 2; i++)
		{
			printf("p[%d]:%d",i, p[i].number);
			printf("p[%d]%s\n",i, p[i].title);
		}///(��) �� �Է¹ް�, ����ϱ� 

	free(p);
	return 0;
}
