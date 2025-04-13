package com.app.binarysearch;

public class RotateSortedArrayBykTime {
	
	public static void reverseArray(int start,int end,int [] arr) {
	
		while(start<end) {
			int tmp=arr[start];
			arr[start]=arr[end];
			arr[end]=tmp;
			start++;
			end--;
		}
	}
	
	public static void rotateByK(int k , int[] nums) {
		int size= nums.length;
		
		if(size > 1) {
		k = (k+size)%size;
		
		reverseArray(0, size-1, nums);
		reverseArray(0, k-1, nums);
		reverseArray(k, size-1, nums);
		
		}
		else if (size==1) {
		System.out.println("Array have only one element.");	
		
		}
		else {
			System.out.println("Arrays is empty.");
		
		}
	}

	public static void display(int [] nums) {
		System.out.print("[ ");
		for(int n : nums)
			System.out.print(" "+n);
		System.out.print(" ]");
		
	}
	public static void main(String[] args) {
		int [] nums = new int [] { 1, 3, 7, 9, 13, 15, 17 };	
		//int [] nums = new int [] { };	
		//int [] nums = new int [] { 1 };	
		int k=-1;
		
		System.out.println("Original Array : ");
		display(nums);
		
		
		System.out.println("\n\n Rotated Array by "+k + ":");
		rotateByK(k, nums);
		display(nums);
		
	}
}
