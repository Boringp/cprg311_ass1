package sorting;

import java.util.Comparator;

import shapes.*;

public class fastSort {
public static <E  extends Comparable<E>> void mergeSort(E shape[]) {
	if (shape.length<2) {
		return;
	}
	int size = shape.length; 
	int mid;

	mid = (int) Math.floor(size/2);
	E[] shape1 = (E[]) new Comparable[mid];
	E[] shape2 = (E[]) new Comparable[size-mid];
	for(int i = 0;i<mid;i++) {
		shape1[i]=shape[i];
	}
	for(int i = 0;i<size-mid;i++) {
		shape2[i]=shape[i+mid];
	}
	mergeSort(shape1);
	mergeSort(shape2);
	merge(shape,shape1,shape2);
	
	
}


public static <E> void mergeSort( Comparable<E>[] shape, Comparator<? super E> comp )
{
	if (shape.length<2) {
		return;
	}
	int size = shape.length; 
	int mid;

	mid = (int) Math.floor(size/2);
	E[] shape1 = (E[]) new Comparable[mid];
	E[] shape2 = (E[]) new Comparable[size-mid];
	for(int i = 0;i<mid;i++) {
		shape1[i]=(E) shape[i];
	}
	for(int i = 0;i<size-mid;i++) {
		shape2[i]=(E) shape[i+mid];
	}
	mergeSort((Comparable<E>[]) shape1,comp);
	mergeSort((Comparable<E>[]) shape2,comp);
	merge(shape,shape1,shape2,comp);

}


public static <E  extends Comparable<E>> void merge(E shape3[],E shape1[],E shape2[]) {
	int size =shape1.length+shape2.length;
	
	for(int n=0,i=0,j=0;n<size;n++) {

		if(i==shape1.length) {
			shape3[n]=shape2[j];j++;
		}
		else if(j==shape2.length) {
			shape3[n]=shape1[i];i++;
		}
		else if(shape1[i].compareTo(shape2[j])>0) {
			shape3[n]=shape1[i];i++;
		}
		else {
			shape3[n]=shape2[j];j++;
		}
	}
	return ;
}

public static <E> void merge( Comparable<E>[] shape,E[] shape1,E[] shape2, Comparator<? super E> comp )
{
int size =shape1.length+shape2.length;
	
	for(int n=0,i=0,j=0;n<size;n++) {

		if(i==shape1.length) {
			shape[n]=(Comparable<E>) shape2[j];j++;
		}
		else if(j==shape2.length) {
			shape[n]=(Comparable<E>) shape1[i];i++;
		}
		else if(comp.compare( (E) shape1[i], (E) shape2[j] ) >0) {
			shape[n]=(Comparable<E>) shape1[i];i++;
		}
		else {
			shape[n]=(Comparable<E>) shape2[j];j++;
		}
	}
	return ;
}


public static <E  extends Comparable<E>> void quickSort(E shape[]) {
	int size = shape.length;
	int mid = (int) Math.floor(size/2);
	
	int i=0,j=size-1;
	while(i<j) {
		if(shape[i].compareTo(shape[mid])>0) {
			i++;
		}
		else {
			
		}
		if(shape[j].compareTo(shape[mid])<0) {
			j--; 
		}
	}
	}
















}
