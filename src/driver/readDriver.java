package driver;
import shapes.*;
import sorting.Arraysorts;
import sorting.fastSort;

import java.lang.reflect.*;
import java.time.Clock;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
public class readDriver {
	
public static void main(String[] args) {
	String path="";
	char sort,type;
	sort=type='\0';
	Shape shapes[];
	for(int i =0;i<args.length;i++) {
		if(args[i].startsWith("-f")||args[i].startsWith("-F")) {
			path=args[i].substring(2);
		}
		if(args[i].startsWith("-t")||args[i].startsWith("-T")) {
			type=args[i].charAt(2);
		}
		if(args[i].startsWith("-s")||args[i].startsWith("-S")) {
			sort=args[i].charAt(2);
		}
	}
	if(path==""||sort=='\0'||type=='\0') {
		helpMessage();
	}
	else {
		try {
			shapes=readFile(path);
			Clock clock = Clock.systemDefaultZone();
			long start = clock.millis();
			if(sort=='b'||sort=='B') {
				if(type=='h'||type=='H') {
					Arraysorts.bubbleSort(shapes);
					
				}
				else if(type=='v'||type=='V') {
					VolumeCompare vc = new VolumeCompare();
					Arraysorts.bubbleSort(shapes,vc);
				}
				else if(type=='a'||type=='A') {
					AreaCompare ac = new AreaCompare();
					Arraysorts.bubbleSort(shapes, ac);
					
				}
			}
			else if (sort=='s'||sort=='S') {
				if(type=='h'||type=='H') {
					Arraysorts.selectionSort(shapes);
					
				}
				else if(type=='v'||type=='V') {
					VolumeCompare vc = new VolumeCompare();
					Arraysorts.selectionSort(shapes,vc);
				}
				else if(type=='a'||type=='A') {
					AreaCompare ac = new AreaCompare();
					Arraysorts.selectionSort(shapes,ac);
				}
			}
			else if (sort=='i'||sort=='I') {
				if(type=='h'||type=='H') {
					Arraysorts.insertionSort(shapes);
					
				}
				else if(type=='v'||type=='V') {
					VolumeCompare vc = new VolumeCompare();
					Arraysorts.insertionSort(shapes,vc);
				}
				else if(type=='a'||type=='A') {
					AreaCompare ac = new AreaCompare();
					Arraysorts.insertionSort(shapes,ac);
					
				}
			}
			else if (sort=='m'||sort=='M') {
				if(type=='h'||type=='H') {
					fastSort.mergeSort(shapes);
					
				}
				else if(type=='v'||type=='V') {
					VolumeCompare vc = new VolumeCompare();
					fastSort.mergeSort(shapes,vc);
				}
				else if(type=='a'||type=='A') {
					AreaCompare ac = new AreaCompare();
					fastSort.mergeSort(shapes,ac);
				}
			}
			else if (sort=='q'||sort=='q') {
				if(type=='h'||type=='H') {
					fastSort.quickSort(shapes);
					
				}
				else if(type=='v'||type=='V') {
					VolumeCompare vc = new VolumeCompare();
					fastSort.quickSort(shapes,vc);
				}
				else if(type=='a'||type=='A') {
					AreaCompare ac = new AreaCompare();
					fastSort.quickSort(shapes,ac);
				}
			}else if (sort=='z'||sort=='Z') {
				if(type=='h'||type=='H') {
					
					
				}
				else if(type=='v'||type=='V') {
					
				}
				else if(type=='a'||type=='A') {
					
				}
			}
			
			long end=clock.millis();
			System.out.println("time used: "+(end-start));
			
			
			if(type=='h'||type=='H') {
				printHeight(shapes);
				
			}
			else if(type=='v'||type=='V') {
				printVolume(shapes);
			}
			else if(type=='a'||type=='A') {
				printArea(shapes);
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
public static void printHeight(Shape shapes[]) {
	for(int i = 0;i<shapes.length;i+=1000) {
		System.out.println(shapes[i].getHeight());
	}
	System.out.println(shapes[shapes.length-1].getHeight());
}
public static void printVolume(Shape shapes[]) {
	for(int i = 0;i<shapes.length;i+=1000) {
		System.out.println(shapes[i].calcVolume());
	}
	System.out.println(shapes[shapes.length-1].calcVolume());
}
public static void printArea(Shape shapes[]) {
	for(int i = 0;i<shapes.length;i+=1000) {
		System.out.println(shapes[i].calcBaseArea());
	}
	System.out.println(shapes[shapes.length-1].calcBaseArea());
}
public static void helpMessage() {
	System.out.println("Error! the argument are not correct.");
	System.out.println("File name F, the compare type and the sort type are provided as parameters (-f –t –s or -F –T –S) via command line.\n"
			+ " where v is volume, h is height, a is base area, b is bubble, s is selection, i is insertion, m is merge, q is quick, and your choice of sorting algorithm is z.");
	System.out.println("Examples are:java -jar sort.jar -fpolyfor1.txt -Tv -Sb\r\n"
			+ "java -jar sort.jar -ta -sQ -f\"res\\polyfor3\".txt\r\n"
			+ "java -jar sort.jar -tH -F\"C:\\temp\\polyfor5.txt\" –sB");

}
public static Shape[] readFile(String filePath) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
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
	shapeReader.close();
	//Arraysorts.insertionSort(allShapes);
	return allShapes;
	
	
	
}

}

