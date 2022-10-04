package shapes;

public class SquarePrism extends Prism {

	public SquarePrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

}
