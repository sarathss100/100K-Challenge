import java.util.Scanner;

public class SearchKey {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter array limit : ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		
		int [] a=new int[100];
		System.out.println("Enter values : ");
		for(i=0;i<limit;i++) {
			a[i]=sc.nextInt();
		}
		int flag=0;
		System.out.println("Enter search key : ");
	    int searchkey=sc.nextInt();
	    for(i=0;i<limit;i++) {
			if(searchkey==a[i]) {
			   flag=1;
				break;
			}
		} 
	    if(flag==1) {
	    	System.out.println("Entered value in "+(i+1)+" position");
	    }else {
	    	System.out.println("Value not found");
	    }
	}
}
