package q4;

public class Missilecontroller {
	
	private static Missilecontroller missileConObj;
	
	private Missileoperation missOp1;
	private Missileoperation missOp2;
	
	private Missilecontroller () {
		
	}
	
	public static Missilecontroller getinstance() {
		if(missileConObj == null) {
			missileConObj = new Missilecontroller();
			System.out.println("Iniialize Missille Controller");
		}
		return missileConObj;
	}
	
	
	
	public void setOperations(Missileoperation launch, Missileoperation blast) {
		missOp1 = launch;
		missOp2 = blast;
	}
	
	
	
	public void performLaunching(String start) {
		missOp1.initiateoperation(start);
	}
	
	public void performBlasting(String end) {
		missOp2.initiateoperation(end);
	}

}
