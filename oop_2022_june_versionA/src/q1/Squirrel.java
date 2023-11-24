package q1;

public class Squirrel extends Pet {
	private String command;
	

	public Squirrel(String command) {
		super();
		this.command = command;
	}

	@Override
	public void feed() {
		System.out.println("feeding the Squirrel");
		double point = getter();
		point += 5;
		setter(point);

	}

	@Override
	public void clean() {
		System.out.println("cleaning the Squirrel");
		double point = getter();
		point += 10;
		setter(point);

	}

	@Override
	public void cuddle() {
		System.out.println("cuddling the Squirrel");
		double point = getter();
		point += 15;
		setter(point);

	}
	
	
	@Override
	public void GetTotalpoints() {
		if (isCaught()) {
			setter(0);
		}
		else
			System.out.println("Total Point is " + getter());
	}
	
	
	public boolean isCaught(){
		try {
			if(this.command.equals("Run5")) {
				throw new CaughtExcaption("caught");
			}
			else {
				System.out.println("Not caught");
			}
		} catch (CaughtExcaption e) {
			System.out.println(e);
			return true;
		}
		
		return false;
	}

	

}
