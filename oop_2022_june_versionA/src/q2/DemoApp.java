package q2;

public class DemoApp {

	public static void main(String[] args) {
		
		Tcalculation<Integer> intObj = new Tcalculation<>();
		intObj.append(2);
		intObj.append(34);
		
		
		Tcalculation<Double> dblObj = new Tcalculation<Double>();
		dblObj.append(65.34);
		dblObj.append(34.4);
		
		System.out.println("int average = " + intObj.average());
		System.out.println("double average = " + dblObj.average());

	}

}
