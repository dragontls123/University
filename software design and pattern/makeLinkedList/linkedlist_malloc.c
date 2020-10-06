#include <stdio.h>
#include <stdlib.h>
typedef  struct NODE {
	int data;
	struct NODE *link;
} NODE;
/*allocate dynamic memory(sizeof(NODE)
 and assign values of 10 and 20.
Let p1 and p2 be linked to the linked list.*/
int main() {
	NODE *p1, *p2;
	p1 = (NODE*)malloc(sizeof(NODE));
	p2 = (NODE*)malloc(sizeof(NODE));
	if (p1 == NULL||p2==NULL) {
		printf("dynamic allocation error");
		exit(1);
	}
	p1->link = NULL;
	p2->link = NULL;
	p1->data = 10;
	p2->data = 20;
	p1->link = p2;
	printf("p1->data:%d p2->data:%d p1->link->p2:%d", p1->data, p2->data, p1->link->data);
	
	free(p1); 
	free(p2);
}
