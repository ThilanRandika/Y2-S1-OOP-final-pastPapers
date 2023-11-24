package q4;

public class RocketMissilesystem implements Missilesystem {
	
	private static RocketMissilesystem rocktMissileObj;
	
	private RocketMissilesystem() {
		
	}
	
	public static RocketMissilesystem getInstance() {
		if (rocktMissileObj == null) {
			rocktMissileObj = new RocketMissilesystem();
			System.out.println("Iniialize Rocket Missille System. . .");
		}
		return rocktMissileObj;
	}

	@Override
	public void launch(String source) {
		System.out.print("Rocket Missile launch from " + source);

	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Rocket missile blast " + destination);

	}

}
