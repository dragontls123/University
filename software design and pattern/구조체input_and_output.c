#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct student {
	char name[20];
	float avg;
	int grade;
};

void input_st(struct student *s);
void output_st(struct student s);
int main() {
	struct student k;
	input_st(&k);
	output_st(k);
}
void input_st(struct student *s) {
	printf("name\n");
	gets/*_s*/(s->name/*,sizeof(s->name)*/);
	printf("avg\n");
	scanf_s("%f", &s->avg,sizeof(s->avg));
	printf("grade\n");
	scanf_s("%d", &s->grade,sizeof(s->grade));
}
void output_st(struct student s) {
	printf("%s %f %d", s.name, s.avg, s.grade);
		
}
