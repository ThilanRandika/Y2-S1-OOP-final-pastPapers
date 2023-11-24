package q1;

public abstract class Item {
	protected int itemNo;
	protected String description;
	protected double unitPrice;
	
	
	public Item(int itemNo, String description, double unitPrice) {
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	
	public void Display() {
		System.out.println("Item no : " + this.itemNo);
		System.out.println("Description : " + this.description);
		System.out.println("Unit Price : " + this.unitPrice);
		System.out.println();
		
	}
}
