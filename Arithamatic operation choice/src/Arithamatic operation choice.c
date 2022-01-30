/*
 ============================================================================
 Name        : Arithamatic.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int num1,num2,choice,sum;
	setbuf(stdout,NULL);
	printf("Please enter 2 numbers : ");
	scanf("%d%d",&num1,&num2);
	printf("Please enter \n1 for Addition : \n2 for substraction : \n3 for Multiplication : \n4 for Division : \n");
	scanf("%d",&choice);
	if(choice==1) {
		sum=num1+num2;
		printf("Result is : %d",sum);
	}else if(choice==2) {
		sum=num1-num2;
	    printf("Result is : %d",sum);
	}else if(choice==3) {
		sum=num1*num2;
	    printf("Result is : %d",sum);
	}else if(choice==4) {
		sum=num1/num2;
	    printf("Result is : %d",sum);
	}else {
		printf("Wrong entry Please Try agian");
	}
	return EXIT_SUCCESS;
}
