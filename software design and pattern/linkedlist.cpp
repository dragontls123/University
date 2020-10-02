#include<stdio.h>
#include<string.h>
#include<stdlib.h>

typedef struct NODE {
	int key;
	struct NODE* next;
}N;

int main() {
	N* head = NULL;
	N a, b, c ;
	int total=0;
	a.key = 100;
	b.key = 200;
	c.key = 300;
	a.next = b.next = c.next = NULL;
	
	head = &a;
	a.next = &b;
	b.next = &c;
	N *ptr = head;
	while (ptr != NULL)
	{
		total += ptr->key;
		ptr = ptr->next;
	}
	printf("%d", total);
}