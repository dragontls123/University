#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include<cstdio>
#include<vector>
#include<algorithm>
using namespace std;

int n;
int result[1000];
vector <int>ti, si;

int main() {
	FILE* fr = fopen("sample.txt", "r");
	int t,tempti,tempsi;
	fscanf(fr,"%d", &t);
	for (int i = 0; i < t; i++) {
		fscanf(fr,"%d", &n);
		for (int i = 0; i < n; i++) {
			//fscanf(fr,"%d %d", &ti[i], &si[i]);
			fscanf(fr,"%d %d", &tempti, &tempsi);
			ti.push_back(tempti);
			si.push_back(tempsi);

		}
		for (int k = 0; k < n; k++) {
			result[k] = k;

		}
		int temp;
		for (int k = 1; k < n; k++) {
			for (int kk = 0; kk < n - k; kk++) {
				if (ti[result[kk]] * si[result[kk + 1]] > ti[result[kk + 1]] * si[result[kk]]) {
					temp = result[kk];
					result[kk] = result[kk + 1];
					result[kk + 1] = temp;
				}
			}
		}
		for (int j = 0; j < n - 1; j++)
			printf("%d ", result[j] + 1);
		printf("%d ", result[n - 1] + 1);
	}
	return 0;
}