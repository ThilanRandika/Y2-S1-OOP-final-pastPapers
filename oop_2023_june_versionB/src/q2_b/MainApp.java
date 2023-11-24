package q2_b;

public class MainApp {

	public static void main(String[] args) {
		Pair<String, Integer> obj1 = new Pair<>("Test1", 42);
		Pair<Double, String> obj2 = new Pair<>(23.33, "Test 2");
		
		System.out.println(obj1.getFirst());
		System.out.println(obj1.getsecond());
		
		System.out.println(obj2.getFirst());
		System.out.println(obj2.getsecond());

	}

}
