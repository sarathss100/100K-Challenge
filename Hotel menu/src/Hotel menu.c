/*
 ============================================================================
 Name        : Hotel.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int choice;
	setbuf(stdout,NULL);
	printf("Welcome to dash Hotel\n1 for Biriyani \n2 for Mandhi \n3 for Poratta \n4 for Chappathi\n");
	printf("Please select a choice : ");
	scanf("%d",&choice);
	switch(choice){
	case 1:
	printf("You've selected Biriyani");
	break;
	case 2:
	printf("You've selected Mandhi");
	break;
	case 3:
	printf("You've selected Poratta");
	break;
	case 4:
	printf("You've selected Chappathi");
	break;
	default:
	printf("Enittu podey");
	}
	return EXIT_SUCCESS;
}
