package q4;

public class HeatMissilesystem implements Missilesystem {
	
	private static HeatMissilesystem heatMissileObj;
	
	private HeatMissilesystem() {
		
	}
	
	public static HeatMissilesystem getInstance() {
		if(heatMissileObj == null) {
			heatMissileObj = new HeatMissilesystem();
			System.out.println("Iniialize Heat Missille System. . .");
		}
		return heatMissileObj;
	}
	
	

	@Override
	public void launch(String source) {
		System.out.print("Heat Missile launch from " + source);

	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Heat missile blast " + destination);

	}

}
