package q4_b;

public class MainApp {

	public static void main(String[] args) {
		MobileUI uiObj = new MobileUI();
		Oven mainOven = new Oven("mainOven");
		GarageGate garageGate = new GarageGate("garageGate");
		
		Command c1 = new OvenOn(mainOven);
		Command c2 = new OvenOff(mainOven);
		
		Command c3 = new GarageGateOpen(garageGate);
		Command c4 = new GarageGateClose(garageGate);
		
		uiObj.setCommand(0, c1);
		uiObj.setCommand(1, c2);
		uiObj.setCommand(2, c3);
		uiObj.setCommand(3, c4);
		
		uiObj.commmandPressed(0);
		uiObj.commmandPressed(1);
		uiObj.commmandPressed(2);
		uiObj.commmandPressed(3);
		
	}

}
