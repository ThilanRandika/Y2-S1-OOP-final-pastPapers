package q2;

public class Book <T, U>{
	private T bookTitle;
	private U booklsBN;
	
	
	public Book(T bookTitle, U booklsBN) {
		this.bookTitle = bookTitle;
		this.booklsBN = booklsBN;
	}
	
	public U getlsBN0() {
		return this.booklsBN;
	}
	
	
}
