package com.app;

import java.util.Arrays;

public class OneDimensionalArrays {

	public static void main(String[] args) {
		
		// Arrays Declaration and Initialization 
		int [] num = new int[5];
		
		// Adding values
		num[0]=12;
		num[1]=04;
		num[2]=23;
		num[3]=56;
		num[4]=83;
		
		
		//Printing Values		
		for(int i=0 ; i < num.length;i++) {
			System.out.println(num[i]+" ");
		}
		

		// Another way to print
		for (int n : num) {
			System.out.println(n);
			}
		

		// Sort the Arrays
		Arrays.sort(num);
		
		System.out.println("Sorted Arrays are : ");
		for (int i : num) {
			System.out.println(i);
		}
		
		// Copy arrays from one var to another		
		int[] num2= Arrays.copyOf(num, num.length);
		System.out.println("Copy Arrays are : ");
		for (int i : num2) {
			System.out.println(i);
		}
		
		// What happen when print directly print num?
		System.out.println(num);
		
		
		// Binary Search
		System.out.println("Binary Search");
		int i = Arrays.binarySearch(num, 56);
		System.out.println("Number : "+i);
		
		
	}

}
