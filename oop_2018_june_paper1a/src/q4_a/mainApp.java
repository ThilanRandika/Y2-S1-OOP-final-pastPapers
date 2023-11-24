package q4_a;

public class mainApp {

	public static void main(String[] args) {
		CreditCard obj1 = CreditCard.getinstance();
		CreditCard obj2 = CreditCard.getinstance();
		
		System.out.println(obj1.validate("sdf4534545", 324));
		System.out.println(obj1.validate("kkjhjuyhgbfrefhu", 333));

	}

}
