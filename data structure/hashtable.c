#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct NODE {
	int key;
	char value[30];
	struct NODE* next;
};

struct NODE* head = NULL;
struct NODE* HashTable[33];

void insert(int key_val, char string[]) {
	HashTable[key_val] = head;
	struct NODE *new_node = (struct NODE*) malloc(sizeof(struct NODE));
	new_node->key = key_val;
	strcpy(new_node->value, string);
	new_node->next = NULL;
	if (head == NULL) {
		head = new_node;
	}
	else {
		while (HashTable[key_val]->next != NULL) HashTable[key_val] = HashTable[key_val]->next;
		HashTable[key_val]->next = new_node;
	}
}

int empty() {
	struct NODE* ptr = head;
	struct NODE* next_ptr = NULL;
	while (ptr) {
		next_ptr = ptr->next;
		free(ptr);
		ptr = next_ptr;
	}
	printf("all memory is deallocated\n");
	exit(1);
}

void deleted(int key_val, char string[]) {
	HashTable[key_val] = head;
	struct NODE *old_ptr = NULL;
	int newkey;
	newkey = key_val;

	old_ptr = NULL;
	if (head == NULL) {
		printf("not found.\n");
	}
	else {
		while (HashTable[key_val]->next != NULL) {
			if (!strcmp(HashTable[key_val]->value, string))
			{
				if (old_ptr == NULL) head = HashTable[key_val]->next;
				else old_ptr->next = HashTable[key_val]->next;
				printf("delete.\n");
				return;
			}
			old_ptr = HashTable[key_val];
			HashTable[key_val] = HashTable[key_val]->next;
		}
	}
	if (!strcmp(HashTable[key_val]->value, string))
	{
		if (old_ptr == NULL) head = HashTable[key_val]->next;
		else old_ptr->next = HashTable[key_val]->next;
		printf("delete.\n");
	}
	else printf("not found\n");
}

void search(int key_val, char string[]) {
	HashTable[key_val] = NULL;
	int newkey = key_val;

	HashTable[key_val] = head;
	if (head == NULL) {
		printf("not found\n");
		return;
	}
	else {
		while (HashTable[key_val]->next != NULL) {
			if (!strcmp(HashTable[key_val]->value, string))
			{
				printf("found\n");
				return;
			}
			HashTable[key_val] = HashTable[key_val]->next;
		}
	}
	if (!strcmp(HashTable[key_val]->value, string)) printf("found.\n");
	else printf("not found.\n");
}

void print()
{
	struct NODE* HashTable[33];
	for (int i = 0; i < 33; i++) {
		HashTable[i] = head;
		printf("--------HashTable %d----------\n", i);
		while (HashTable[i] != NULL) {
			if(i== HashTable[i]->key)
			printf("value: %s\n", HashTable[i]->value);
			HashTable[i] = HashTable[i]->next;
		}
		free(HashTable[i]);
	}
}
//대문자와 소문자 상관없이 같은 글자라면 같은 index에 저장이 된다
int hashFunc(char string[]) {
	int key = 0;
	int sum = 0;

	for (int i = 0; i < strlen(string); i++) {
		if (65 <= string[i] && string[i] <= 90) {
			sum = sum + string[i] + 32;
		}
		else {
			sum += string[i];
		}
	}
	key = sum % 33;
	return key;
}

int main() {
	int r = 1;
	int item;
	char string[30];
	while (1) {
		printf("1: insert, 2: delete, 3: print, 4: search, 5: exit\n");
		scanf("%d", &r);
		if (r == 1) {
			printf("insert ");
			scanf("%s", string);
			item = hashFunc(string);
			insert(item, string);
		}
		else if (r == 2) {
			printf("delete ");
			scanf("%s", string);
			item = hashFunc(string);
			deleted(item, string);
		}
		else if (r == 3) {
			print();
		}
		else if (r == 4) {
			printf("search ");
			scanf("%s", string);
			item = hashFunc(string);
			search(item, string);
		}
		else if (r == 5) {
			empty();
		}
	}
	return 0;
}