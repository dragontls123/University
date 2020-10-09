#include <stdio.h>
#define number 8


int data[number] = { 85, 24, 63, 45, 17, 31, 96, 50 };

void quickSort(int *data, int start, int end) {

	if (start >= end)

		return; // ���� 1��

	int key = start; //�Ǻ��� ù���� ���ҷ�

	int i = start + 1; //�ϳ��� �̵��Ҷ�...

	int j = end;

	int temp;

	while (i <= j) {//������������ �ݺ�

		while (data[i] <= data[key]) {

			i++;

		}

		while (data[j] >= data[key] && j > start) {

			j--;

		}

		if (i > j) {

			temp = data[j];

			data[j] = data[key];

			data[key] = temp;

			for (int i = 0; i < number; i++)

				printf("%d\t", data[i]);

			printf("\n");

		}




		else {

			temp = data[j];

			data[j] = data[i];

			data[i] = temp;

		}

	}




	quickSort(data, start, j - 1);

	quickSort(data, j + 1, end);

}




int main() {

	quickSort(data, 0, number - 1);

	for (int i = 0; i < number; i++) {




		printf("%d \t", data[i]);

	}

	return 0;

}