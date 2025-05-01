package com.app;
import java.util.Arrays;

public class OneDimensionalArrays {

	public static int circularArrayIndex(int index,int size) {		
		// effective index
		int effective_index= ((index%size)+size)%size;
		return effective_index;
	}

	public static void main(String[] args) {

		// Arrays Declaration and Initialization
		int[] num = new int[7];
		
		// Adding values
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		num[5] = 6;
		num[6] = 7;

		// Printing Values
		for (int i = 0; i < num.length; i++) {
			System.out.print (num[i] + " ");
		}

		// Another way to print
		for (int n : num) {
			System.out.print(n+" ");
		}

		// Sort the Arrays
		Arrays.sort(num);

		System.out.println("\nSorted Arrays are : ");
		for (int i : num) {
			System.out.print(i+" ");
		}

		// Copy arrays from one var to another
		int[] num2 = Arrays.copyOf(num, num.length);
		System.out.println("\nCopy Arrays are : ");
		for (int i : num2) {
			System.out.print(i+" ");
		}

		// What happen when print directly print num?
		System.out.println("\nnum print : "+num);

		// Binary Search
		int i = Arrays.binarySearch(num, 7);
		System.out.println("Binary Search Key Index : " + i);
		
		// 1,2,3,4,5,6,7
		int i1;
		i1= circularArrayIndex(-1,num.length);
		System.out.println("Effective Index is->"+i1 +
				" and Values is->"+num[i1]);
		
		// Pre value of 1;
		i1= circularArrayIndex(-11,num.length);
		System.out.println("Effective Index is->"+i1 +
				" and Values is->"+num[i1]);

	}

}
