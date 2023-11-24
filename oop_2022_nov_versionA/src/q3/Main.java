package q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Object lk = new Object();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Patterri 1 = ");
		String p1 = userInput.next();
		
		System.out.print("Enter Patterri 2 = ");
		String p2 = userInput.next();
		
		System.out.print("Enter count = ");
		int c = userInput.nextInt();
		
		Thread obj1 = new Pattern01(lk, p1, c);
		Thread obj2 = new Pattern02(lk, p2, c);
		
		obj1.start();
		obj2.start();
		
		try {
			obj1.join();
			obj2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	

	}

}
