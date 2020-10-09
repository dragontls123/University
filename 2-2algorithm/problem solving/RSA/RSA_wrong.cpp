
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int Mod_Exp(int a, int b, int n);

int main(void) {
	int p, q;
	int M;
	int n, PI, e = 0, d = 0;
	int counter = 1;
	int i;
	int cipher_text, original;

	printf("p and q : ");
	scanf_s("%d %d", &p, &q);
	n = p * q;
	PI = (p - 1) * (q - 1);
	printf("p:%d\nq:%d\nn:%d\nphi(n):%d\n", p, q,n,PI);

	for (i = 2; i <= PI; i++) { /*e구하기*/
		if (PI % i != 0) {
			e = i;
			break;
		}
	}
	printf("e : %d\n", e);
	while (1) { /*d계산*/
		if (((counter * PI) + 1) % e == 0) {
			d = ((counter * PI) + 1) / e;
			break;
		}
		counter++;
	}
	printf("d : %d\n", d);
	
	M = 13;
	
	cipher_text = Mod_Exp(M, e, n);
	printf("c: %d\n", cipher_text);
	
	printf("m: %d\n", M);
	
	return 0;
}

int Mod_Exp(int a, int b, int n) {
	int i;
	int c = 0;
	int d = 1;
	int b_copy = b;
	int k = 0;

	i = 0;
	while (1) {/*2진수로 만들 때 얼마나 동적 메모리를 잡아야 하는지 알기 위해*/
		if (b > pow(2, i)) {
			k = i;
		}
		else break;
		i++;
	}
	int* bin = (int*)malloc(sizeof(int) * (k + 1));

	for (i = 0; i <= k; i++) {/*작은순서로 2진수 할당*/
		bin[i] = b_copy % 2;
		b_copy = b_copy / 2;
	}

	for (i = k; i >= 0; i--) {
		c = 2 * c;
		d = (d*d) % n;
		if (bin[i] == 1) {
			c += 1;
			d = (d*a) % n;
		}
	}
	return d;
}