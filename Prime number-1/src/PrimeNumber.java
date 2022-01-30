import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter limit : ");
		Scanner s=new Scanner(System.in);
		
		int limit=s.nextInt();
		int flag=0;
		
		for(int i=2;i<=limit/2;i++) {
			if(limit%i==0){
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Number is not a prime number");
		}else {
			System.out.println("Number is a prime number");
		}
	}
}
