/*
 ============================================================================
 Name        : Search.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,a[5],searchkey,flag=0;
	setbuf(stdout,NULL);
	printf("Enter values : ");

	for(i=0;i<5;i++){
		scanf("%d",&a[i]);
	}
	printf("Please enter search key  : ");
	scanf("%d",&searchkey);
	for(i=0;i<5;i++){
			if(searchkey==a[i]){
				flag=1;
				break;
			}
		}
	if(flag==1){
		printf("It is in %d position",i+1);
	}else {
		printf("value not found");
	}
	return EXIT_SUCCESS;
}
