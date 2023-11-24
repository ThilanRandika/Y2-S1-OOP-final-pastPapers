package q1;

public class Car extends Item {
	private String model;
	private String type;
	
	
	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}
	
	
	public void Display(){
		System.out.println("Item no : " + this.itemNo);
		System.out.println("Description : " + this.description);
		System.out.println("Unit Price : " + this.unitPrice);
		System.out.println("Model : " + this.model);
		System.out.println("Type : " + this.type);
		System.out.println();
	}
}
