#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include<string.h>

struct course {
	char subj[20];	//과목명
	char pro[10];	//교수님 성함
	int room;	//강의실 호수
};

int main(void)
{
	int menu;
	char menu2[20];
	int i = 5;

	struct course c[20] = {
	{ "소프트웨어구현패턴","민연아",304 },
	{ "확률통계", "노웅기", 305 },
	{ "로봇공학", "강상우", 601 },
	{ "소프트웨어의 생태계", "김진환", 304 },
	{ "분산시스템", "황효석", 410 },
	};

	
	while (1)
	{
		printf("-------------------------------\n");
		printf("|메뉴를 고르시오.             |\n");
		printf("|  (1)추가 (2)검색 (3)끝내기  |\n");
		printf("-------------------------------\n");

		printf("번호 입력: ");
		scanf("%d", &menu);

		switch (menu)
		{
		case 1:
			//구조체 변수 새로 생성

			//과목명 입력받기
			printf("\n과목명: ");
			scanf("%s", c[i].subj);
			printf("교수명: ");
			scanf("%s", c[i].pro);
			printf("강의실: ");
			scanf("%d", &c[i].room);
			i++;

			printf("\n**추가 완료!**\n\n");

			break;

		case 2:
			printf("\n교수님 성함을 입력하시오 : ");
			scanf("%s", menu2);

			printf("\n-----------결과 출력-----------\n");
			for (int j = 0; j < sizeof(c) / sizeof(c[0]); j++)
			{
				if (strcmp(c[j].pro, menu2) == 0)
				{
					printf("과목명: %s\n", c[j].subj);
					printf("교수명: %s\n", c[j].pro);
					printf("강의실: %d\n\n", c[j].room);
				}
			}

			break;

		case 3:
			printf("프로그램 종료\n");
			return 0;
		}
	}

	return 0;
}

