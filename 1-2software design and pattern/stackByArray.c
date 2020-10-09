#include <stdio.h>

#define STACKSIZE   10
#define PUT(x)  if (push(x)) fprintf(stderr, "Cannot put %d.\n", x);\
                else printf("PUT: %d\n", x);
#define GET     if (pop(&item)) fprintf(stderr, "Cannot get.\n");\
                else printf("GET: %d\n", item);

int stack[STACKSIZE];
int top = -1, item;

int is_full()  { return (top == STACKSIZE - 1); }
int is_empty() { return (top == -1); }

int push(int item) {
    if (is_full()) return -1;
    stack[++top] = item;
    return 0;
}

int pop(int *item) {
    if (is_empty()) return -1;
    *item = stack[top--];
    return 0;
}

void main()
{
    PUT(10); PUT(40); PUT(15); PUT(35);
    GET; GET;
    PUT(50); PUT(20); PUT(25); PUT(50);
    GET; GET; GET; GET; GET; GET;
}
