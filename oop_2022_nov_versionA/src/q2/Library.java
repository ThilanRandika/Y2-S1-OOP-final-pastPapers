package q2;

import java.util.HashMap;

public class Library {

	public static void main(String[] args) {
		HashMap<Integer, Book> bookList = new HashMap<>();
		
		Book<String, String> obj1 = new Book<>("HP", "ISBN12345");
		bookList.put(1, obj1);
		
		Book<Integer, String> obj2 = new Book<>(3244, "dsda");
		bookList.put(2, obj1);
		
		for (int id: bookList.keySet()) {
		Book value = bookList.get(id);
		System.out.println("Book ID is: "+ id + "ancl the ISBN is: " + value.getlsBN0());
		}
		

	}

}
