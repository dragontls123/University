#include <stdio.h>
#include <stdlib.h>

typedef enum proc_state { init = 0, ready, running, terminate } ProcState;

typedef struct myprocess
{
	int id;
	ProcState state;
	int arrival_time;
	int burst_time;
	int remain_time;
} MyProcess;

int num_proc = 0;
MyProcess proc_list[100];
int tick = 0;
int waiting_time = 0;
int temp = 0;
int s = 0;//switch variable
void print_all_process()
{
	printf("process list at tick: %d\n", tick);
	printf("===================================\n");
	for (int i = 0; i < num_proc; i++) {
		printf("-----------------------------------\n");
		printf("process id: %d\n", proc_list[i].id);
		printf("state(0:init/1:ready/2:running/3.terminate): %d\n", proc_list[i].state);
		printf("arrival time: %d\n", proc_list[i].arrival_time);
		printf("burst_time: %d\n", proc_list[i].burst_time);
		printf("remain_time: %d\n", proc_list[i].remain_time);
	}
	printf("===================================\n");
}

void print_brief_process()
{
	printf("process list at tick: %d\n", tick);
	printf(" id  stat  at   bt   rt\n");
	for (int i = 0; i < num_proc; i++) {
		printf("%04d %04d %04d %04d %04d\n",
			proc_list[i].id,
			proc_list[i].state,
			proc_list[i].arrival_time,
			proc_list[i].burst_time,
			proc_list[i].remain_time);
	}
	printf("----------------------------------\n");
}


int SJF()
{	int min = 0;
	int max = 0;
	
	switch (s) {
	case 0:
		for (int i = 0; i < num_proc; i++) {
			if (proc_list[i].state == ready) {
				if (min > proc_list[i].burst_time)
					min = proc_list[i].burst_time;
			}
		}
		for (int i = 0; i < num_proc; i++) {
			if (proc_list[i].burst_time == min) {
				proc_list[i].state = running;
				temp = i;
			}
		}
		s = 1;
		break;
	case 1:
		proc_list[temp].remain_time--;
		for (int i = 0; i < num_proc; i++) {
			if (i != temp) {
				waiting_time++;
			}
		}
		if (proc_list[temp].burst_time == 0) {
			proc_list[temp].state = terminate;
			s = 0;
		}
		break;
	}
	// return
	// 1. normal
	// 0. all process are terminated
	for (int i = 0; i < num_proc; i++) {
		max += proc_list[i].burst_time;
	}
	if(tick>max)
		return 0;
	return 1;
}

int main()
{
	// read process and set their state to "INIT" (not ready)
	FILE* fp;
	fp = fopen("process_list.txt", "r");
	fscanf(fp, "%d\n", &num_proc);
	printf("number of processes: %d\n", num_proc);
	for (int i = 0; i < num_proc; i++) {
		fscanf(fp, "%d", &proc_list[i].id);
		fscanf(fp, "%d", &proc_list[i].arrival_time);
		fscanf(fp, "%d", &proc_list[i].burst_time);
		proc_list[i].remain_time = proc_list[i].burst_time;
		proc_list[i].state = init;
	}
	// optional
	print_brief_process();

	// scheduling
	int be_ready = 0;
	while (tick < 20)
	{
		// Set ready when tick is process's arrival time
		if (be_ready < num_proc) {
			for (int i = 0; i < num_proc; i++) {
				if (proc_list[i].arrival_time == tick) {
					proc_list[i].state = ready;
					be_ready++;
				}
			}
		}
		if (SJF() == 0) break;;
		tick++;
		print_brief_process();
	}
	printf("average waiting time = %.2f\n", (float)waiting_time / num_proc);

	return 0;

}


