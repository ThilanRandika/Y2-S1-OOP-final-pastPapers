package q1;

public class Book extends Item {
	private String publisher;
	private String category;
	private int pages;
	
	
	public Book(int itemNo, String description, double unitPrice, String publisher, String category, int pages) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}
	
	
	public void Display(){
		System.out.println("Item no : " + this.itemNo);
		System.out.println("Description : " + this.description);
		System.out.println("Unit Price : " + this.unitPrice);
		System.out.println("Publisher : " + this.publisher);
		System.out.println("Category : " + this.category);
		System.out.println("Pages : " + this.pages);
		System.out.println();
	}
	
}
