package q2_b;

public class Calculation extends Thread {

	private double ans;

	
	public double getAns() {
		return ans;
	}
	
	
	
	
	public void Factorial(int start, int end) {
		double fac  = 1.0;
		for (int i = start; i <= end; i++) {
			fac *= (double)i;
		}
		this.ans = fac;
	}

	

	
}
