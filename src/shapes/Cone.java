package shapes;


public class Cone extends Shape {
	
	protected double radius;
	
	public Cone(double height,double radius) {
		this.height=height;
		this.radius=radius;
		
	}
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return calcBaseArea()*this.height/3;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}



}
