package shapes;

public class Pyramid extends Shape {
protected double side;
	
	public Pyramid(double height,double side) {
		this.height=height;
		this.side=side;
		
	}
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return calcBaseArea()*this.height/3;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}



}
