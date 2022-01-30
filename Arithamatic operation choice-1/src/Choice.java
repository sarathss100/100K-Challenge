import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers : ");
		try (Scanner s = new Scanner(System.in)) {
			int num1=s.nextInt();
			int num2=s.nextInt();
			
			System.out.println("Please select your choice : ");
			System.out.println("1 for Addition\n2 for Substraction\n3 for Multiplication\n4 for Division :");	
			
			int choice=s.nextInt();
			
			if(choice==1) {
				int sum=num1+num2;
				System.out.println("Result is : "+sum);
			}else if(choice==2) {
				int sum=num1-num2;
				System.out.println("Result is : "+sum);  	
			}else if(choice==3) {
				int sum=num1*num2;
				System.out.println("Result is : "+sum);
			}else if(choice==4) {
				int sum=num1/num2;
				System.out.println("Result is : "+sum);
			}else {
				System.out.println("Enittu podey");
			}
		}
	}

}
