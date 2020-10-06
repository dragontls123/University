#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Player {
    int backNumber;
    char name[20];
    int age, AMatches, goals;
} Player;

typedef struct Node {
    Player player;
    struct Node *next;
} Node;

Node *createNewNode(Player player)
{
    Node *ptr = (Node *)malloc(sizeof(Node));
    memcpy(&(ptr->player), &player, sizeof(player));
    ptr->next = NULL;
    return ptr;
}

Node *makeList(Player arr[], int size)
{
    Node *head, *ptr;
    if (size <= 0) return NULL;
    head = createNewNode(arr[0]);
    ptr = head;

    for (int i = 1; i < size; i++) {
        ptr->next = createNewNode(arr[i]);
        ptr = ptr->next;
    }
    return head;
}

void freeList(Node *head)
{
    Node *ptr = head;
    while (ptr != NULL) {
        Node *next = ptr->next;
        free(ptr);
        ptr = next;
    }
}

Player players[] = {
    {  1, "Jung Sung-Ryong", 25,  22,  0 },
    {  7, "Park Ji-Sung",    29,  94, 13 },
    { 10, "Park Chu-Young",  25,  47, 15 },
    { 12, "Lee Young-Pyo",   33, 119,  5 },
    { 16, "Ki Sung-Yong",    21,  28,  4 },
    { 17, "Lee Chung-Yong",  22,  27,  4 },
    { 22, "Cha Du-Ri",       30,  51,  4 }
};

void main()
{
    Node *playerList = makeList(players, sizeof(players) / sizeof(Player));

    Node *cur = playerList;
    Player minPlayer; int minAge = 99999;
    while (cur != NULL) {
        if (cur->player.age < minAge) {
            minAge = cur->player.age;
            memcpy(&minPlayer, &(cur->player), sizeof(Player));
        }
        cur = cur->next;
    }
    printf("The player with the minimum age is:\n");
    printf("%d, %s, %d, %d, %d\n",
        minPlayer.backNumber, minPlayer.name, minPlayer.age, minPlayer.AMatches, minPlayer.goals);

    freeList(playerList);
}
