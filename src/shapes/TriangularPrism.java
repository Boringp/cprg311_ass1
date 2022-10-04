package shapes;

public class TriangularPrism extends Prism {

	public TriangularPrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return this.side*this.side/4*Math.pow(3, 1/2);
	}

}
