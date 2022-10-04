package shapes;

public class OctagonalPrism extends Prism {

	public OctagonalPrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 2*(1+Math.pow(2, 1/2))*this.side*this.side;
	}

}
