import java.util.Scanner;

public class IFTest {

	public static void main(String[] args) {
		System.out.println("Please enter 3 numbers");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		if(num1>num2&&num1>num3) {
			System.out.println("Number "+num1+" is greatest");
		}else if(num2>num3) {
			System.out.println("Number "+num2+" is greatest");
		}else {
			System.out.println("Number "+num3+" is greatest");
		}

	}

}
