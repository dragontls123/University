#include <stdio.h>
int front = -1;
int rear = -1;
int queue[100];

void enqueue(int a){
	rear++;
	queue[rear] = a;
}
void dequeue() {
	if (front == rear)
		return;
	printf("queue[%d]=%d\n", front+1, queue[front+1]);
	front++;
}
void queue_full(){
	if (rear == 99)
		printf("full\n");
	return;
}
void queue_empty() {
	if (front == rear) {
		printf("empty\n");

		return;
	}
}


int main() {
	int s = 0;
	int t = 0;

	while (s!=3) {
		printf("1:enqueue 2:dequeue 3:exit\n");
		scanf("%d", &s);

		switch (s) {
		case 1:
			queue_full();
			printf("input queue[%d]>", rear + 1);
			scanf("%d", &t);
			enqueue(t);
			break;
		case 2:
			queue_empty();
			dequeue();
			break;
		case 3:
			break;
		}
	}


}
