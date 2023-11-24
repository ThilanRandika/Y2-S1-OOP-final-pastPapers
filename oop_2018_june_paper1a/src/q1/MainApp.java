package q1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Item> itemsArrayList = new ArrayList();
		
		Book b1 = new Book(0, null, 0, null, null, 0);
		Book b2 = new Book(0, null, 0, null, null, 0);
		itemsArrayList.add(b1);
		itemsArrayList.add(b2);
		
		Car c1 = new Car(0, null, 0, null, null);
		Car c2 = new Car(0, null, 0, null, null);
		itemsArrayList.add(c1);
		itemsArrayList.add(c2);
		
		for (Item item : itemsArrayList) {
			item.Display();
		}
	}

}
