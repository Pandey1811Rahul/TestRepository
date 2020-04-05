import java.util.Scanner;

public class TestProject {
	
public static void main(String[] args) {
	  
     
     Scanner sc= new Scanner(System.in);
     
     System.out.print("enter 1st NO:");
    
	  
	  int a= sc.nextInt();
	  System.out.print("enter 2nd NO:");
	  int b= sc.nextInt();
	  
       int c= add(a,b);
        System.out.println(a+"+"+b+"="+c);
        
        int d=substract(a,b);
        System.out.println(a+"-"+b+"="+d);
	  sc.close();
	}
	
	
		private static int  substract(int a, int b) {
	   
			int c=a-b;
			return c;
	
}


		public static int add(int a,int b) {
			int c=a+b;
			return c;
		}
	
		
	

}
