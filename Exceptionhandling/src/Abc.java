import java.util.Scanner;

public class Abc {
	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a  numbers:");
	
	int num= sc.nextInt();
	try {
	int res = 100/num;
 System.out.println(res);
	}
 catch(ArithmeticException e) {
	 System.out.println("somthing divided by zero is undifined");
 }
	finally {
		sc.close();
		System.out.println("Scanner object closed");
		
	}
 System.out.println("**********");
 
	
  }
}

	
	


