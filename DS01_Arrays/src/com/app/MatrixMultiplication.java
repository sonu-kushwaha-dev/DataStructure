package com.app;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int [] [] row_matrix= {{11,12,13}};
		int [] [] col_matrix= {
				{11},
				{21},
				{31}};
		
		
		System.out.println("Row Matrix : ");
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print(row_matrix[i][j]+" ");
			}
		}
		
		System.out.println("\nColumn Matrix : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(col_matrix[i][j]+" ");
			}
			
		}
		
		int [][] m1 =
				{{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		int [][] m2 =
				{{10,1,0},
				{4,2,5},
				{3,7,9}};
		
		int [][] result = new int [3][3];
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j]=0;
				for(int k =0; k < 3; k++) {
				result  [i] [j] +=  m1[i][k]*m2[k][j];
				}
			}
		}
		
		System.out.println("\nProduct : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print(result[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
