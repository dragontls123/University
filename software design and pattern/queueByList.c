#include <stdio.h>
#include <stdlib.h>

#define PUT(x)  if (enqueue(x)) fprintf(stderr, "Cannot put %d.\n", x);\
                else printf("PUT: %d\n", x);
#define GET     if (dequeue(&item)) fprintf(stderr, "Cannot get.\n");\
                else printf("GET: %d\n", item);

typedef struct Node {
    int item;
    struct Node *next;
} Node;

Node *front = NULL, *back = NULL, *temp;
int item;

int is_full()  { return 0; }
int is_empty() { return (front == NULL); }

int enqueue(int item) {
    if (is_full()) return -1;
    temp = (Node *)malloc(sizeof(Node));
    temp->item = item; temp->next = NULL;
    if (front == NULL) { front = back = temp; }
    else { back->next = temp; back = temp; }
    return 0;
}

int dequeue(int *item) {
    if (is_empty()) return -1;
    *item = front->item;
    temp = front; front = front->next;
    if (front == NULL) back = NULL;
    free(temp);
    return 0;
}

void print() {
    temp = front;
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
