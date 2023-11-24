package q1;

import java.util.concurrent.CancellationException;

public class Parrot extends Pet {
	private String command;
	
	public Parrot(String command) {
		super();
		this.command = command;
	}
	
	

	@Override
	public void feed() {
		System.out.println("feeding the Parrot");
		double point = getter();
		point += 5;
		setter(point);

	}

	@Override
	public void clean() {
		System.out.println("cleaning the Parrot");
		double point = getter();
		point += 10;
		setter(point);

	}

	@Override
	public void cuddle() {
		System.out.println("cuddling the Parrot");
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
			if(this.command.equals("walk")) {
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
