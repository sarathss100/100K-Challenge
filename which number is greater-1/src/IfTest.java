import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		if(num1>num2) {
			System.out.println("Number "+num1+" is greatest");
		}else {
			System.out.println("Number "+num2+" is greatest");
		}

	}

}
