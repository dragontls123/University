#include <stdio.h>
#include <stdlib.h>

#define PUT(x)  if (push(x)) fprintf(stderr, "Cannot put %d.\n", x);\
                else printf("PUT: %d\n", x);
#define GET     if (pop(&item)) fprintf(stderr, "Cannot get.\n");\
                else printf("GET: %d\n", item);

typedef struct Node {
    int item;
    struct Node *next;
} Node;

Node *top = NULL, *temp;
int item;

int is_full()  { return 0; }
int is_empty() { return (top == NULL); }

int push(int item) {
    if (is_full()) return -1;
    temp = (Node *)malloc(sizeof(Node));
    temp->item = item; temp->next = top;
    top = temp;
    return 0;
}

int pop(int *item) {
    if (is_empty()) return -1;
    *item = top->item;
    temp = top; top = top->next;
    free(temp);
    return 0;
}

void print() {
    temp = top;
    while (temp) {
        printf("%d ", temp->item);
        temp = temp->next;
    }
    printf("\n");
}

void main()
{
    PUT(10); PUT(40); PUT(15); PUT(35);
    print();
    GET; GET;
    PUT(50); PUT(20); PUT(25); PUT(50);
    print();
    GET; GET; GET; GET; GET; GET;
}
