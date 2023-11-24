package q1;

public class Cat extends Pet {

	@Override
	public void feed() {
		System.out.println("feeding the cat");
		double point = getter();
		point += 5;
		setter(point);

	}

	@Override
	public void clean() {
		System.out.println("cleaning the cat");
		double point = getter();
		point += 10;
		setter(point);

	}

	@Override
	public void cuddle() {
		System.out.println("cuddling the cat");
		double point = getter();
		point += 15;
		setter(point);

	}

	@Override
	public void GetTotalpoints() {
		System.out.println("Total point is " + getter());
		
	}

}
