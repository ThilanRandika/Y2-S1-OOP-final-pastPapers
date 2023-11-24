package q4_b;

public class OvenOff implements Command {
	private Oven ovenObj;

	public OvenOff(Oven ovenObj) {
		this.ovenObj = ovenObj;
	}

	@Override
	public void execute() {
		ovenObj.off();
	}

}
