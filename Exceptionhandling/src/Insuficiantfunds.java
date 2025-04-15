import java.util.Scanner;



public class Insuficiantfunds extends Exception{
	
	public Insuficiantfunds(String msg) {
		super(msg);
		
	}

}
public class Exl{
	
}
public static void main(String[]args) {
	double ma = 10000.00;
	Scanner sc = new Scanner(System.in);
	
			System.out.println("enter amount");
	double wa = sc.nextDouble();
	
	if(wa>ma) {
		throw new Insuficiantfunds("not have enough balance");
	}
	else {
		System.out.println("balance withdraw");
	}
}
