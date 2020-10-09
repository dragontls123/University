#include <stdio.h>
#include <stdlib.h>
int top = -1;
int stack[100];

void push(int a) {
	top++;
	stack[top] = a;
}
void pop() {
	if (top >= 0) {
		printf("stack[%d]=%d\n", top, stack[top]);
		top--;
	}
}
void stack_full() {
	if (top >= 100)
		printf("full\n");
	return;
}
void stack_empty() {
	if (top < 0)
		printf("empty\n");
	return;
}
int main() {
	int s = 0;
	int t = 0;

	while (true) {
		printf("1:push 2:pop 3:exit\n");
		scanf("%d", &s);
		
		switch (s) {
		case 1:
			stack_full();
			printf("input stack[%d]>", top+1);
			scanf("%d", &t);
			push(t);
			break;
		case 2:
			stack_empty();
			pop();
			break;
		case 3:
			break;
		}
	}
}
​