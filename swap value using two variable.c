#include <stdio.h>
int main()
{
	int a=9, b=6;
	b=a+b;
	a=b-a;
	b=b-a;
	printf("swapped value of a and b is %d & %d" ,a,b);
	return 0;
}