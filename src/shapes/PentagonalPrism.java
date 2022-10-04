package shapes;

public class PentagonalPrism extends Prism {

	public PentagonalPrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 5*this.side*this.side*Math.tan(54* Math.PI / 180)/4;
	}

}
