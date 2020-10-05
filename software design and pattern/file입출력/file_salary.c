#include<stdio.h>
#include<string.h>
#include<stdlib.h>

struct st {
	char name[10];
	int age;
	float salary;
};

int main() {
	struct st s[10]{
		{"kim",20,50000.0},{"lee",45,100000.0},{"youn",44,90000.0},{"choi",20,45000.0},{"han",30,75000.0},{"ko",30,70000.0}
	};
	int t = 0;//counter
	struct st temp[10]{ 0, };//temp
	struct st temp1[10]{ 0, };//v1
	struct st temp2[10]{ 0, };//v2
	struct st temp3[10]{ 0, };//v3
	FILE *fp, *fp1, *fp2;
	fp = fopen("salary_v1.txt", "w");
	if (fp == NULL) { printf("err"); exit(1); }
	fwrite(s,sizeof(struct st), sizeof(s) / sizeof(s[0]), fp);
	fclose(fp);//salary_v1.txt
	
	fp = fopen("salary_v1.txt", "r");
	fp1 = fopen("salary_v2.txt", "w");
	if (fp == NULL||fp1==NULL) { printf("err"); exit(1); }
	for (int i = 0; i < sizeof(s) / sizeof(s[0]); i++) {
		fread(&temp, sizeof(struct st), 1, fp);
		if (temp->age == 0)
			break;
		temp1[i].age = temp->age;
		strcpy(temp1[i].name, temp->name);
		if(temp->age>=40&&temp->age<=49)
		temp1[i].salary = 1.1*temp->salary;//Update data so that salaries of employees aged from 40 to 49 are raised 10%
		else 
			temp1[i].salary = temp->salary;
		t++;
	}
	
	for (int i = 0; i < t; i++) {
		fprintf(fp1,"%s %d %.1f\n", temp1[i].name, temp1[i].age, temp1[i].salary);
	}//salary_v2.txt
	fclose(fp); fclose(fp1);
	
	fp1 = fopen("salary_v2.txt", "w");
	if (fp1 == NULL) { printf("err"); exit(1); }
	fwrite(temp1, sizeof(struct st), sizeof(s) / sizeof(s[0]), fp1);
	fclose(fp1);

	fp1 = fopen("salary_v2.txt", "r");
	fp2 = fopen("salary_v3.txt", "w");
	if (fp1 == NULL || fp2 == NULL) { printf("err"); exit(1); }
	for (int i = 0; i < sizeof(s) / sizeof(s[0]); i++) {
		fread(&temp2, sizeof(struct st), 1, fp1);
		temp3[i].age = temp2->age;
		strcpy(temp3[i].name, temp2->name);
		if (temp2->age >= 30 && temp2->age <= 39)
		temp3[i].salary = 1.2*(temp2->salary);	//Update data so that salaries of employees aged from 30 to 39 are raised 20%
		else
			temp3[i].salary = temp2->salary;
	}
	for (int i = 0; i < t; i++) {
		fprintf(fp2,"%s %d %.1f\n", temp3[i].name, temp3[i].age, temp3[i].salary);
	}//salary_v3.txt
	fclose(fp1); fclose(fp2);
	
	for (int i = 0; i < t; i++) {
		printf("%-6s %d    %.1f\t-> %.1f\n", temp3[i].name, temp3[i].age, s[i].salary,temp3[i].salary);
	}//compare v1 with v3
}