package com.app;

public class MatrixAdjacentElement {

	public static void main(String[] args) {

		int[][] matrix = { { 11, 12, 13, 14, 15 }, { 21, 22, 23, 24, 25 }, { 31, 32, 33, 34, 35 },
				{ 41, 42, 43, 44, 45 }, { 51, 52, 53, 54, 55 } };

		System.out.println("Original Matrix");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("***");

		System.out.println("Print Adjutant element of particular index.");
		// Non Circular matrix
		int index_row = 1;
		int index_col = 1;

		//Example 1
		for (int i = index_row - 1; i <= index_row + 1; i++) {
			for (int j = index_col - 1; j <= index_col + 1; j++) {
				
				if((i>=0 && i<5) && (j>=0 && j<5) && !(i==index_row && j==index_col)) {
					System.out.print(matrix[i][j]+" ");
				}
				if(i==index_row && j==index_col) {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println("");
		}
		
		 index_row = 0;
		 index_col = 0;
		 // Example 2
		for (int i = index_row - 1; i <= index_row + 1; i++) {
			for (int j = index_col - 1; j <= index_col + 1; j++) {
				
				if((i>=0 && i<5) && (j>=0 && j<5) && !(i==index_row && j==index_col)) {
					System.out.print(matrix[i][j]+" ");
				}
				if(i==index_row && j==index_col) {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println("");
		}
		
		
		
		System.out.println("***");
		// Circular matrix
		
		 index_row = 0;
		 index_col = 0;

		 
		for (int i = index_row - 1; i <= index_row + 1; i++) {
			for (int j = index_col - 1; j <= index_col + 1; j++) {
				
				if(!(i==index_row && j==index_col)) {
					
					System.out.print(matrix[(i+5)%5][(j+5)%5]+" ");
				}
				
				// we can ignore this, its just place holder
				if(i==index_row && j==index_col) {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println("");
		}
		

	}

}
