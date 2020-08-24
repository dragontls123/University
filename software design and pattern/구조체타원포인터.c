#include<stdio.h>
#include<string.h>
struct circle
{
	int d;
	float x, y;
	char color[15];

};
int main() {
	struct circle a;
	struct circle *aP;
	aP = &a;
	strcpy(a.color, "red");
	a.x = 3.5;
	a.y = 5.5;
	printf("%f %f %s\n", a.x, a.y, a.color);
	aP->x;
	aP->y;
	printf("%f %f %s\n", aP->x, aP->y, aP->color);
}