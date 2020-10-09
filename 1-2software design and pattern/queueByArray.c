#include <stdio.h>

#define QUEUESIZE   10
#define PUT(x)  if (enqueue(x)) fprintf(stderr, "Cannot put %d.\n", x);\
                else printf("PUT: %d\n", x);
#define GET     if (dequeue(&item)) fprintf(stderr, "Cannot get.\n");\
                else printf("GET: %d\n", item);

int queue[QUEUESIZE];
int front = 0, size = 0, item;

int is_full()  { return (size == QUEUESIZE); }
int is_empty() { return (size == 0); }

int enqueue(int item) {
    if (is_full()) return -1;
    queue[(front + size++) % QUEUESIZE] = item;
    return 0;
}

int dequeue(int *item) {
    if (is_empty()) return -1;
    *item = queue[front++];
    front %= QUEUESIZE; size--;
    return 0;
}

void main()
{
    PUT(10); PUT(40); PUT(15); PUT(35);
    GET; GET;
    PUT(50); PUT(20); PUT(25); PUT(50);
    GET; GET; GET; GET; GET; GET;
}
