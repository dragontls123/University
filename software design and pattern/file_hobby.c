#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct st {
	char name[10];
	int age;
	char hobby[20];
};
struct st_age {
	char name[10];
	int age;
};//Generate a struct array that has only name and age
struct st_hobby {
	char name[10];
	char hobby[20];
};//Generate a struct array that has only name and hobby

int main() {
	struct st s[10]{ {"kim",20,"swim"},{"choi",20,"swim"},{"han",30,"poker"},{"ko",30,"movie"},{"lee",45,"music"},{"youn",44,"poker"} };
	FILE *fp, *fp1, *fp2;
	struct st temp[]{ 0, };
	struct st_age tempa[10]{ 0, };
	struct st_hobby temph[10]{ 0, };
	int t = 0;//카운터
	fp = fopen("personal.txt", "w");
	if (fp == NULL) {
		printf("error");
		exit(1);
	}
	fwrite(s, sizeof(struct st), sizeof(s) / sizeof(s[0]), fp);
	fclose(fp);

	fp = fopen("personal.txt", "r");//Read data from file personal.txt
	fp1 = fopen("age.txt", "w+"); //write to file age.txt
	fp2 = fopen("hobby.txt", "w+");//write to file hobby.txt
	if (fp == NULL || fp1 == NULL || fp2 == NULL) {
		printf("error");
		exit(1);
	}
	for (int i = 0; i < sizeof(s) / sizeof(s[0]); i++) {
		fread(&temp, sizeof(struct st), 1, fp);
		if (temp->age == 0)
			break;
		//age부분
		tempa[t].age = temp->age;
		strcpy(tempa[t].name , temp->name);
		//hobby부분
		strcpy(temph[t].name, temp->name);
		strcpy(temph[t].hobby, temp->hobby);
		t++;
	}
	for (int i = 0; i < t; i++) {
		fprintf(fp1,"%s %d\n", tempa[i].name, tempa[i].age);
	}
	for (int i = 0; i < t; i++) {
		fprintf(fp2,"%s %s\n", temph[i].name, temph[i].hobby);
	}
	fclose(fp); fclose(fp1); fclose(fp2);
}