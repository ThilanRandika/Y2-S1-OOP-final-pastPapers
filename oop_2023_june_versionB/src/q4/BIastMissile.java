package q4;

public class BIastMissile implements Missileoperation {
	Missilesystem misssile;
	
	

	public BIastMissile(Missilesystem misssile) {
		this.misssile = misssile;
	}



	@Override
	public void initiateoperation(String location) {
		misssile.blast(location);

	}

}
