#include "makeList.h"

void main()
{
    int arr[] = { 100, 250, 467 };

    NODE *head = makeList(arr, sizeof(arr) / sizeof(arr[0]));
    printList(head);
    freeList(head);
}
