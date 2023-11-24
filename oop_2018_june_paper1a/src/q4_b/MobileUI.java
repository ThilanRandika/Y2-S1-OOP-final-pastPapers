package q4_b;

public class MobileUI {
	private Command cmdArr[];

	public MobileUI() {
		this.cmdArr = new Command[6];
	}
	
	public void setCommand(int index, Command cmdObj) {
		this.cmdArr[index] = cmdObj;
	}
	
	public void commmandPressed(int index) {
		cmdArr[index].execute();
	}
	

}
