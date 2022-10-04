package shapes;



public abstract class Shape implements Comparable<Shape> {
	protected double height;

	public abstract double calcVolume();

	public abstract double calcBaseArea();
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public int compareTo(Shape s) {
		if ( this.getHeight() > s.getHeight() ) return 1;
		else if ( this.getHeight() < s.getHeight() ) return -1;
		else return 0;

	}
	
}
