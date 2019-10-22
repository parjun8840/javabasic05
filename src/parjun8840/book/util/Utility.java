package parjun8840.book.util;

public class Utility {
	//OCP based method. At the time of writing the logic no idea of elements ( Product, String, Integer).
	//For homogenous collection retreive, don't try to be oversmart and compare int with string etc.
	public static void sort (Comparable[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = i+1; j < elems.length; j++) {
				if(elems[i].compareTo(elems[j]) > 0) { //If the comparasion returns numeric value greater than 0 then swap.
					Comparable swap = elems[i];
					elems[i] = elems[j];
					elems[j] = swap;
					
				}
			}
			
		}
		
	}

}
