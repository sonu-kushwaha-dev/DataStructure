package com.app.binarysearch;

public class FindKeyRotatedSortArray {

	public static int findKey(int[] nums, int key) {

		int size = nums.length;

		if (size == 0) {
			return -1;
		} else if (size == 1 && nums[0] == key) {
			return 0;
		} else {
			int start = 0, end = size - 1, mid = 0;
			while (start <= end) {
				
				mid = start + (end - start) / 2;

				if (nums[mid] == key) {
					return mid;
				} else if (nums[start] < nums[mid]) {

					if (key >= nums[start] && key < nums[mid]) {
						end = mid - 1;
					} else {
						start = mid +1;
					}
				} else {
					if (key > nums[mid] && key <= nums[end]) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				}
			}

		}
		return -1;
	}

	public static void display(int[] nums) {
		System.out.print("[");
		for (int n : nums)
			System.out.print(" " + n);
		System.out.print(" ]");

	}

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 3, 4, 5, 6, 7, 1 };

		System.out.println("Original Array:");

		display(nums);
		
		System.out.print("\n\nFinding key index : "+findKey(nums, 1));
	}
}
