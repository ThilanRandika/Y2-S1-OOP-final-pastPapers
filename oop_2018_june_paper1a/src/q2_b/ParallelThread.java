package q2_b;

public class ParallelThread extends Thread {
	private Calculation myCalc;
	private int start;
	private int end;
	
	public ParallelThread(Calculation myCalc, int start, int end) {
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}
	
	
	public void run() {
//		synchronized (ParallelThread.class) {
//			myCalc.Factorial(start, end);
//		}
	
		myCalc.Factorial(start, end);
		
	}

}
