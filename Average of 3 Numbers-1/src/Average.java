import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		System.out.println("Please enter 3 Numbers : ");
		
		Scanner s=new Scanner(System.in);
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		int average=((num1+num2+num3)/3);
		
		System.out.println("Average is : "+average);

	}

}
