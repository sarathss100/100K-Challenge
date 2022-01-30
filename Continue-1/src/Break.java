
public class Break {

	public static void main(String[] args) {

      for(int i=1;i<=10;i++) {
    	  System.out.println("Hi");
    	  if(i==5) {
    		  continue;
    	  }
    	  System.out.println("Hello");
      }
          System.out.println("Finished");
	}
}
