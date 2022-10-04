package shapes;


public class Cylinder extends Shape {
	
	protected double radius;
	
	public Cylinder(double height,double radius) {
		this.height=height;
		this.radius=radius;
		
	}
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return calcBaseArea()*this.height;
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
	public String toString() {
		return "This is a Cylinder.height:"+this.height+"/n Radius:"+this.radius;
	}


}
