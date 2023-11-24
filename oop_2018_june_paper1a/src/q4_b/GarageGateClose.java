package q4_b;

public class GarageGateClose implements Command {
	
	private GarageGate garageObj;
	
	

	public GarageGateClose(GarageGate garageObj) {	
		this.garageObj = garageObj;
	}



	@Override
	public void execute() {
		garageObj.close();

	}

}
