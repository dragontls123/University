#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct song {
	char name[25];
	float length;
	int id;
};

int main() {
	int i = 2;//초기입력된 개수
	int si;//3번용 변수
	int insert;//스위치
	struct song s1[20] = { 
	{ "song",1.1,1 },
	{"songsong",2.2,2}};
	while (1) {	
		printf("\n1.insert 2.print 3.search 4.exit\n");
		scanf("%d", &insert);
		switch (insert)
		{case 1://인서트
			printf("song name");//노래 입력
			scanf_s("%s",s1[i].name,sizeof(s1[0].name));//노래 받기
			printf("length\n");//길이 입력
			scanf_s("%f", &s1[i].length, sizeof(s1[0].length));//길이받기
			printf("id\n");//아이디 입력
			scanf_s("%d", &s1[i].id, sizeof(s1[0].id));//아이디 받기
			i++;
			break;

		case 2://프린트
			for (int tt = 0; tt < i; tt++)
				printf("id=%d, length=%f, name=%s\n", s1[tt].id, s1[tt].length, s1[tt].name);
			break;

		case 3://검색
			printf("id입력");
			scanf("%d", &si);

			for (int t = 0; t < sizeof(s1) / sizeof(s1[0]); t++) {
				if (si == s1[t].id) {
					printf("id=%d, length=%f, name=%s\n", s1[t].id, s1[t].length, s1[t].name);
				}
			}
			break;

		case 4: //끝내기
			return 0;
	
		}
	}
	
	
}