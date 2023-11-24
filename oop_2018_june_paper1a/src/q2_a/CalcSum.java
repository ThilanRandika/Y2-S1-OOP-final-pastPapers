package q2_a;

public class CalcSum implements Runnable {

	public void run() {
		int sum = 0 ;
		for (int i = 0; i < 100000; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName() + " = " + sum);
	}
	
		

}
