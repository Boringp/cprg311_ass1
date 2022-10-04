package driver;
import shapes.*;
import sorting.Arraysorts;
import sorting.fastSort;

import java.lang.reflect.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class appDriver {
public static void main(String[] s) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	readFile("res/polyfor1.txt");
}




public static void readFile(String filePath) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
{	File text = new File(filePath);
	Scanner shapeReader = new Scanner(text);
	int size = shapeReader.nextInt();
	Shape[] allShapes= new Shape[size];
	String type;
	double height,var2;
	for(int i=0;i<size;i++) {
		 type = "shapes."+shapeReader.next();
		 height = shapeReader.nextDouble();
		 var2 = shapeReader.nextDouble();
		Class c = Class.forName(type);
		Constructor cons = c.getConstructor(double.class,double.class);
		Object o = cons.newInstance(height,var2);
		allShapes[i]=(Shape)o;
	} 
	//Arraysorts.insertionSort(allShapes);
	fastSort.mergeSort(allShapes);
	for(int i=0;i<size;i=i+1000) {
	System.out.println(allShapes[i].getHeight());}
	Arraysorts.bubbleSort(allShapes);

	for(int i=0;i<size;i=i+1000) {
	System.out.println(allShapes[i].getHeight());}
	
	shapeReader.close();
	
}

}

