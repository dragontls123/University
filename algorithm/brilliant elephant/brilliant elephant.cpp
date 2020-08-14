#ifdef _MSC_VER
#define _CRT_SECURE_NO_WARNINGS
#endif
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct elephants {
	int order;
	int weight;
	int IQ;
};
typedef struct elephants Elephant;
typedef Elephant* ElephantPtr;

int lineCount(FILE* fr);
void sort(ElephantPtr elephant, int len);
void smart(ElephantPtr elephant, int len);

void main()
{
	FILE* fr= fopen("input.txt", "r");
	
		if (fr == NULL)
		{
			printf("FILE doesn't exists!\n");
			exit(0);
		}

		char temp[20];
		int length = lineCount(fr), j = 0;
		ElephantPtr elephant = (ElephantPtr)malloc(sizeof(Elephant) * length);

		while (fgets(temp, sizeof(temp), fr) != NULL)
		{
			(elephant + j)->weight = atoi(strtok(temp, " "));
			(elephant + j)->IQ = atoi(strtok(NULL, " "));
			(elephant + j)->order = j + 1;
			j++;
		}

		sort(elephant, length);
		smart(elephant, length);

		fclose(fr);
	

	
}

int lineCount(FILE * fr)
{
	int count = 0;
	char temp[20];
	while (fgets(temp, sizeof(temp), fr) != NULL)
	{
		count++;
	}
	rewind(fr);
	return count;
}

void sort(ElephantPtr elephant, int len)
{
	int min = 0, index = 0;
	for (int i = 0; i < len - 1; i++)
	{
		min = (elephant + i)->weight;
		index = i;

		for (int j = i + 1; j < len; j++)
		{
			if ((elephant + j)->weight < min)
			{
				min = (elephant + j)->weight;
				index = j;
			}
		}

		int temp1 = (elephant + index)->order;
		int temp2 = (elephant + index)->IQ;
		int temp3 = (elephant + index)->weight;
		(elephant + index)->order = (elephant + i)->order;
		(elephant + index)->IQ = (elephant + i)->IQ;
		(elephant + index)->weight = (elephant + i)->weight;
		(elephant + i)->order = temp1;
		(elephant + i)->IQ = temp2;
		(elephant + i)->weight = temp3;
	}
}

void smart(ElephantPtr elephant, int len)
{
	int count = 0, iq = 0;
	int* list = (int*)malloc(sizeof(int) * len);
	for (int i = 0; i < len; i++)
	{
		if (i == 0)
		{
			list[count] = (elephant + i)->order;
			iq = (elephant + i)->IQ;
			count++;
			continue;
		}

		if (iq < (elephant + i)->IQ)
		{
			if (count < 2)
			{
				count = 0;
				list[count] = (elephant + i)->order;
				iq = (elephant + i)->IQ;
				count++;
				continue;
			}
			else
				continue;
		}
		else
		{
			list[count] = (elephant + i)->order;
			iq = (elephant + i)->IQ;
			count++;
			continue;
		}
	}

	printf("%d\n", count);
	for (int i = 0; i < count; i++)
	{
		printf("%d\n", list[i]);
	}
	
}