package shapes;

public abstract class Prism extends Shape {
	protected double side;
	public Prism(double height,double side) {
		this.height=height;
		this.side=side;
	}
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return calcBaseArea()*super.getHeight();
	}

	@Override
	public abstract double calcBaseArea();
	
	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}


}
