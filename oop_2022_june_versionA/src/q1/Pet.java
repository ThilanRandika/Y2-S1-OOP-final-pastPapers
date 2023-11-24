package q1;

public abstract class Pet implements PointAllocator {
	
	private double points;

	@Override
	public double getter() {
		return this.points;
	}

	@Override
	public void setter(double points) {
		this.points = points;
	}
	
	
	public abstract void feed();
	
	public abstract void clean();
	
	public abstract void cuddle();
	
	public abstract void GetTotalpoints();
}
