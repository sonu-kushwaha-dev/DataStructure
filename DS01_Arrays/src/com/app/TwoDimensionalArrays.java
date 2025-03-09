package com.app;

import java.util.Arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

		// Arrays Initialization
		int[][] array = new int[3][2];

		// Values added
		array[0][0] = 05;
		array[0][1] = 33;
		array[1][0] = 82;
		array[1][1] = 96;
		array[2][0] = 72;
		array[2][1] = 61;

		// Print the values of arrays
		System.out.println("Using Regular For Loop");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

		// Using Enhanced For Loop
		System.out.println("Using Enhanced For Loop");
		for (int[] is : array) {
			for (int n : is) {
				System.out.print(n + " ");
			}
			System.out.println("");
		}
		
		
		// Another Way to Declare Arrays
		System.out.println("Using Stream API");

		int [][] array2 =
			{{11,12,13},
			{21,22,23},
			{31,32,33}};
		
		// Arrays element print using stream API
		Arrays.stream(array2).
		forEach(nums->{
			Arrays.stream(nums).forEach(n->System.out.print(n+" "));
			System.out.println("");
		});
		
	}
}