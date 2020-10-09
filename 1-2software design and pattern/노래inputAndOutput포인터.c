#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct song {
	float l;
	char name[20];
	int id;
};

void input_s(struct song *s);
void output_s(struct song s[]);
void search_s(struct song s[]);
int main() {
	struct song song[20] = { 0, };
	int s;
	int i = 0;
	while (1) {
		printf("1.input 2.output 3.search 4.end\n");
		scanf("%d", &s);
		switch (s)
		{
		case 1:
			input_s(&song[i]);
			i++;
			break;
		case 2: 
			output_s(song);
			break;
		case 3 :
			search_s(song);
			break;
		case 4:
			return 0;
		}
		
	}
}

void input_s(struct song *s) {
	printf("length\n");
	scanf("%f", &s->l);
	getchar();
	printf("name\n");
	gets(s->name);
	getchar();
	printf("id\n");
	scanf("%d", &s->id); 
	getchar();
}

void output_s(struct song s[]) {
	for (int t = 0; t < 20; t++)
	{
		printf("id=%d  length=%f  name=%s \n", s[t].id, s[t].l, s[t].name);
		
	}
	
}
void search_s(struct song s[]) {
	int i;
	printf("id?");

	scanf("%d", &i);
	for(int t=0;t< 20;t++)
		if(i==s[t].id)
			printf("id=%d  length=%f  name=%s \n", s[t].id, s[t].l, s[t].name);

}