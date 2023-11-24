package q4;

public class Test {

	public static void main(String[] args) {
		HeatMissilesystem hMiss = HeatMissilesystem.getInstance();
		RocketMissilesystem rMiss = RocketMissilesystem.getInstance();
		
		Missilecontroller missCon = Missilecontroller.getinstance();
		
		missCon.setOperations(new LaunchMissile(hMiss), new BIastMissile(hMiss));
		missCon.performLaunching("Colombo");
		missCon.performBlasting("Flight MH370");
		
		missCon.setOperations(new LaunchMissile(rMiss), new BIastMissile(rMiss));
		missCon.performLaunching("Kandy");
		missCon.performBlasting("Flight MH420");

	}

}
