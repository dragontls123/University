#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct st {
	char name[10];
	int age;
	char hobby[20];
};

int main() {
	struct st s[10]{{"kim",20,"swim"},{"choi",20,"swim"},{"han",30,"poker"},{"ko",30,"movie"},{"lee",45,"music"},{"youn",44,"poker"} };
	FILE *fp, *fp1;
	int j = 0;//10대 카운터
	int jj = 0;//20대 카운터
	int jjj = 0;//30대 카운터
	int jjjj = 0;//40대 카운터
	struct st temp[]{0, };//temp
	struct st temp0[10]{0, };//10대
	struct st temp1[10]  ;//20대
	struct st temp2[10];//30대
	struct st temp3[10];//40대
	fp = fopen("personal.txt", "w");
	if (fp == NULL) {
		printf("error"); 
		exit(1); 
	}
	fwrite(s, sizeof(struct st), sizeof(s) / sizeof(s[0]), fp);//Read data from file personal.txt
	fclose(fp);

	fp = fopen("personal.txt", "r");
	fp1 = fopen("output.txt", "w");
	if (fp == NULL||fp1==NULL) { 
		printf("error"); 
		exit(1); 
	}
	for (int i = 0; i < sizeof(s) / sizeof(s[0]); i++) {
		fread(&temp, sizeof(struct st), 1, fp); 
		
		if (temp->age >= 10 && temp->age < 20) {//age from 10 to 19
			temp0[j].age = temp->age;
			strcpy(temp0[j].hobby, temp->hobby);
			strcpy(temp0[j].name, temp->name);
			//printf("%d %s %d %s\n", j, temp0[j].name, temp0[j].age, temp0[j].hobby);
			j++;
		}
		if (temp->age>= 20&& temp->age<30) {//age from 20 to 29
			temp1[jj].age=temp->age;
			strcpy(temp1[jj].hobby,temp->hobby );
			strcpy(temp1[jj].name,temp->name );
			//printf("%d %s %d %s\n",jj, temp1[jj].name, temp1[jj].age,temp1[jj].hobby);
			jj++; 	
		}
		if (temp->age >= 30 && temp->age < 40) {//age from 30 to 39
			temp2[jjj].age = temp->age;
			strcpy(temp2[jjj].hobby, temp->hobby);
			strcpy(temp2[jjj].name, temp->name);
			//printf("%d %s %d %s\n", jjj, temp2[jjj].name, temp2[jjj].age, temp2[jjj].hobby);
			jjj++;
		}
		if (temp->age >= 40 && temp->age < 50) {//age from 40 to 49
			temp3[jjjj].age = temp->age;
			strcpy(temp3[jjjj].hobby, temp->hobby);
			strcpy(temp3[jjjj].name, temp->name);
			//printf("%d %s %d %s\n", jjjj, temp3[jjjj].name, temp3[jjjj].age, temp3[jjjj].hobby);
			jjjj++;
		}
	}
	//Generate a struct array foreach age range and write tofile output.txt
	fprintf(fp1, "age from 10 to 19\n---------------------------\n");
	for (int ii = 0; ii < j; ii++) {
		fprintf(fp1, "%-6s %-6d %-6s\n", temp0[ii].name, temp1[ii].age, temp1[ii].hobby);
	}
	fprintf(fp1, "\nage from 20 to 29\n---------------------------\n");
	for (int ii = 0; ii < jj; ii++) {
		fprintf(fp1, "%-6s %-6d %-6s\n", temp1[ii].name, temp1[ii].age, temp1[ii].hobby);
	}
	fprintf(fp1, "\nage from 30 to 39\n---------------------------\n");
	for (int ii = 0; ii < jjj; ii++) {
		fprintf(fp1, "%-6s %-6d %-6s\n", temp2[ii].name, temp2[ii].age, temp2[ii].hobby);
	}
	fprintf(fp1, "\nage from 40 to 49\n---------------------------\n");
	for (int ii = 0; ii < jj; ii++) {
		fprintf(fp1, "%-6s %-6d %-6s\n", temp3[ii].name, temp3[ii].age, temp3[ii].hobby);
	}
	fclose(fp1);
	fclose(fp);
}