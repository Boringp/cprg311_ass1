package shapes;

import java.util.Comparator;

public class VolumeCompare implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		if( o1.calcVolume() > o2.calcVolume() )
		{
			return 100;
		}
		else if( o1.calcVolume() < o2.calcVolume() )
		{
			return -100;
		}
		else // stud1.getGrade() == stud2.getGrade()
		{
			return 0;
		}
	}

}
