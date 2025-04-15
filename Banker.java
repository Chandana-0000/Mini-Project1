public class Banker {
	static double cb=50000.00;
	
	static void checkBal() {
		System.out.println("current balance "+cb);
	}
		static void withdraw(double wa) {
			if(wa<=cb) {
			cb=cb-wa;
		System.out.println("successfully amount has withdrawn");
		System.out.println("current balance "+ cb);
		}
			else {
				System.out.println("insufficient funds ..........");
			}
		}
		static void deposit(double da) {
			cb=cb+da;
			System.out.println("amount deposited "+da);
			System.out.println("current balance "+cb);
		
	}
	
}