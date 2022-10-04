package sorting;

public class Arraysorts {

public static <E  extends Comparable<E> >void  insertionSort(E[] shape) {
	int size = shape.length; 
	for(int i=1; i<size;i++)
	{
		 for(int j=i;j!=0;j--) {
			 if(shape[j].compareTo(shape[j-1])>0) {
				 E temp=shape[j];
				 shape[j]=shape[j-1];
				 shape[j-1]=temp;
			 }
		 }
	}
}
public static <E  extends Comparable<E>> void bubbleSort(E[] shape) {
	int size=shape.length;
	for(int i=size-1;i>0;i--) {
		for(int j = 0;j<i;j++) {
			 if(shape[j].compareTo(shape[j+1])<0) {
				 E temp=shape[j];
				 shape[j]=shape[j+1];
				 shape[j+1]=temp;
			 }
		}
	}
}

public static <E  extends Comparable<E>> void selectionSort(E[] shape) {
	int size=shape.length;
	E biggest;int index=0;
	for(int i=0;i<size;i++) {
		biggest=shape[i];index=i;
		for(int j=i+1;j<size;j++) {
			if(shape[j].compareTo(biggest)>0)
				{biggest=shape[j];
				index=j;}
			 }
		shape[index]=shape[i];
		shape[i]=biggest;
		}
		
	}






}

