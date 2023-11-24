package q4_a;

public class CreditCard {
	private static CreditCard ccObj;
	
	private CreditCard() {
		
	}
	
	public static CreditCard getinstance() {
		if (ccObj == null) {
			ccObj = new CreditCard();
			System.out.println("New object");
		}
		else {
			System.out.println("Existing object");
		}
		
		return ccObj;
	}
	
	
	public boolean validate(String cardno, int code) {
		
		return (cardno.length() == 16  && code%3 == 0);
	}
	

}
