import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		System.out.println("Welcome to De Hotel");
		System.out.println("Please select your choice : ");
		System.out.println("1 for Biriyani\n2 for Chappathi\n3 for Poratta\n4 for Mandhi :");
		
		Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        
        switch (choice) {
        case 1:
        	System.out.println("You've selected Biriyani");
        break;
        case 2:
        	System.out.println("You've selected Chappathi");
        break;
        case 3:
        	System.out.println("You've selected Poratta");
        break;
        case 4:
        	System.out.println("You've selected Mandhi");
        break;
        default:
        	System.out.println("Enittu podey");
       break;
        }
	}

}
