#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int key;
    struct node *next;
} NODE;

NODE *makeList(int arr[], int size)
{
    NODE *head, *ptr; int i;

    if (size <= 0) return NULL;
    head = (NODE *)malloc(sizeof(NODE));
    head->key = arr[0];
    head->next = NULL;
    ptr = head;

    for (i = 1; i < size; i++) {
        ptr->next = (NODE *)malloc(sizeof(NODE));
        ptr = ptr->next;
        ptr->key = arr[i];
        ptr->next = NULL;
    }
    return head;
}

void printList(NODE *head)
{
    NODE *ptr = head;
    while (ptr != NULL) {
        printf("%d\n", ptr->key);
        ptr = ptr->next;
    }
}

void freeList(NODE *head)
{
    NODE *ptr = head;
    while (ptr != NULL) {
        NODE *next = ptr->next;
        free(ptr);
        ptr = next;
    }
}
