#include <stdio.h>

int main() {
	char *suit[4] = { "a","bb","ccc","dddd" };//포인트변수 4개 선언
	
	*suit = "apple";//*suit==suit[0]
	suit[1] = "banana";
	printf("%s\n", *suit);
	printf("%s\n", suit[1]);
	puts(suit[2]);//printf("%s",suit[2]);

	char *sinsang[4] = { "s","sp","spo","base" };
	printf("%s\n", sinsang[2]);
	sinsang[2] = "gan";
	printf("%s\n", sinsang[2]);
}