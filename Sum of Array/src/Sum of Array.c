/*
 ============================================================================
 Name        : Sum.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,sum=0,a[5];
	setbuf(stdout,NULL);
	printf("Enter values : ");
	for(i=0;i<5;i++) {
		scanf("%d",&a[i]);
	}
	for(i=0;i<5;i++) {
	 sum=sum+a[i];
		}
	printf("Result is : %d",sum);
	return EXIT_SUCCESS;
}
