package q2_a;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		CountDown obj1 = new CountDown();
		
		Thread t1 = new Thread(new CalcSum());
		Thread t2 = new Thread(new CalcSum());
		
		t1.setName("Black");
		t2.setName("White");
		
		obj1.start();
		
		obj1.join();
		t1.start();
		t2.start();
		
	}

}
