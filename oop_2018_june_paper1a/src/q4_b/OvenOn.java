package q4_b;

public class OvenOn implements Command {
	private Oven ovenObj;

	public OvenOn(Oven ovenObj) {
		this.ovenObj = ovenObj;
	}

	@Override
	public void execute() {
		ovenObj.on();
	}

}
