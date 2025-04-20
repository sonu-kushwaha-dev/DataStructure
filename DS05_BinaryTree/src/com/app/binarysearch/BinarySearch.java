package com.app.binarysearch;

public class BinarySearch {

	public int search(int[] nums, int target) {

		int low = 0, high = nums.length - 1, mid=0;

		while (low <= high) {
			
			mid = low + (high - low) / 2;
			
			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		int[] nums = { 1, 3, 7, 9, 13, 15, 17 };

		System.out.println(bs.search(nums, 17));

	}
}
