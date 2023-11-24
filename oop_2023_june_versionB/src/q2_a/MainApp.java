package q2_a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		
		int num = 0;
		System.out.println("Enetr a number : ");
		Scanner userInput = new Scanner(System.in);
		num = userInput.nextInt();
		
		while (num != 0) {
			arrList.add(num);
			System.out.println("Enetr a number : ");
			num = userInput.nextInt();
		}
		
		
		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i)%2 == 0) {
				arrList.remove(i);
				i--;
			}
		}
		
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		
	

	}

}
