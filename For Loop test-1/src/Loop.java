import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		System.out.println("Enter a limit : ");
		Scanner s=new Scanner(System.in);
		
		int limit=s.nextInt();
		int sum=0;
		for(int i=1;i<=limit;i++) {
			sum=sum+i;
		}
        System.out.println("Result is : "+sum);
	}

}
