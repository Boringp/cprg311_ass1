package sorting;

import java.util.Comparator;

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
public static <E> void insertionSort( Comparable<E>[] shape, Comparator<? super E> comp )
{
	int size = shape.length; 
	for(int i=1; i<size;i++)
	{
		 for(int j=i;j!=0;j--) {
			 if(comp.compare( (E) shape[j], (E) shape[j-1] ) > 0 ) {
				 Comparable<E> temp=(Comparable<E>) shape[j];
				 shape[j]=shape[j-1];
				 shape[j-1]= temp;
				 
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


public static <E> void bubbleSort( Comparable<E>[] shape, Comparator<? super E> comp )
{
	int size=shape.length;
	for(int i=size-1;i>0;i--) {
		for(int j = 0;j<i;j++) {
			 if(comp.compare( (E) shape[j], (E) shape[j+1])<0) {
				 Comparable<E> temp=shape[j];
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

public static <E> void selectionSort( Comparable<E>[] shape, Comparator<? super E> comp )
{
	int size=shape.length;
	Comparable<E> biggest;int index=0;
	for(int i=0;i<size;i++) {
		biggest=shape[i];index=i;
		for(int j=i+1;j<size;j++) {
			if(comp.compare( (E) shape[j], (E) biggest)>0)
				{biggest=shape[j];
				index=j;}
			 }
		shape[index]=shape[i];
		shape[i]=biggest;
		}
		}




public static <T> boolean isSorted( Comparable<T>[] array )
{
	for( int i = 0; i < array.length - 1; i++ )
	{
		// this unchecked cast is safe because all the elements have already
		// been type checked when they were added to the list, thus the 
		// suppress warning can be used
		if( (array[i].compareTo((T) array[i+1])) < 0 )
		{
			return false;
		}
	}
	return true;
}




}

