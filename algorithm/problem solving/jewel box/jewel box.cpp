#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
	FILE* fr = fopen("sample.txt", "r");
	while (1) {
		int jew;

		fscanf_s(fr, "%d", &jew);

		if (jew == 0)
			break;
		else if (jew < 0 || jew > 1000) {
			printf("wrong value1.\n");
		}


		int c1, n1, c2, n2;
		fscanf_s(fr, "%d %d", &c1, &n1);
		if ((c1 < 0 || c1 > 1000) || (n1 < 0 || n1 > 1000)) {
			printf("wrong value2.\n");
			continue;
		}


		fscanf_s(fr, "%d %d", &c2, &n2);
		if ((c2 < 0 || c2 > 1000) || (n2 < 0 || n2 > 1000)) {
			printf("wrong value3.\n");
			continue;
		}


		int max = 0, maxN, extraN;
		if (n1 / c1 > n2 / c2) {
			max = jew / n1;
			maxN = n1;
			extraN = n2;
		}
		else {
			max = jew / n2;
			maxN = n2;
			extraN = n1;
		}

		int i;
		for (i = 0; i < max; i++) {
			if ((max * maxN) + (i * extraN) == jew) {
				if (maxN == n1) {
					printf("%d %d\n", max, i);
					break;
				}
				else if (maxN == n2) {
					printf("%d %d\n", i, max);
					break;
				}
			}
			else if ((max * n1) + (i * n2) != jew) {
				max--;
			}
		}
		if ((max * maxN) + (i * extraN) != jew) {
			printf("failed.\n");
		}
	}
	return 0;
}