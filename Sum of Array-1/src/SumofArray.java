import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter array limit : ");
		Scanner sc=new Scanner(System.in);
		
		int limit=sc.nextInt();
		
		System.out.println("Enter values : ");
		
		int []a=new int[100];
		for(i=0;i<limit;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(i=0;i<limit;i++) {
			sum=sum+a[i];
		}
		System.out.println("Result is : "+sum);
	}
}
