package q2_b;

public class MainThreadApp {

	public static void main(String[] args) {
		Calculation calObj = new Calculation();
		
		ParallelThread p1 = new ParallelThread(calObj, 1, 10);
		ParallelThread p2 = new ParallelThread(calObj, 11, 20);
		ParallelThread p3 = new ParallelThread(calObj, 21, 30);
		ParallelThread p4 = new ParallelThread(calObj, 31, 40);
		
		p1.start();
		try {
			p1.join();
			
			
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p2.start();
		try {
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		p3.start();
		try {
			p3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		p4.start();
		try {
			p4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(calObj.getAns());

	}

}
