import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter limit : ");
		
		Scanner s=new Scanner(System.in);
		int limit=s.nextInt();
		
		for(int i=0;i<=limit;i++) {
			for(int j=limit;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
