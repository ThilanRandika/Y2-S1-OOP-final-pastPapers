package q4_b;

public class GarageGateOpen implements Command {
	
	private GarageGate garageObj;
	
	

	public GarageGateOpen(GarageGate garageObj) {	
		this.garageObj = garageObj;
	}



	@Override
	public void execute() {
		garageObj.open();

	}

}
