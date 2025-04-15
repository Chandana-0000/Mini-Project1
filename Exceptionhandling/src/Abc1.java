
import java.util.Scanner;

public class Abc1 {
	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter two numbers:");
	
	
	try {
		int num1= sc.nextInt();
		int num2= sc.nextInt();
	   int res = num1+num2;
            System.out.println(res);
	}
 catch(Exception ae) {
	ae.printStackTrace();
	
 }
	finally {
		sc.close();
		System.out.println("Scanner object closed");
		
	}
 System.out.println("**********");
 
	
  }
}
