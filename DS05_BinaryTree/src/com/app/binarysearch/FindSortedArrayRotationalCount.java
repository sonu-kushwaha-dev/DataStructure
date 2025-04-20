package com.app.binarysearch;

public class FindSortedArrayRotationalCount {

	public static int findRotationalCount(int[] nums) {

		int size = nums.length;
		int start = 0, end = size - 1;

		if (size == 0) {
			return -1;
		} else if (size == 1) {
			return 0;

		} else {
			int mid = 0;
			while (start <= end) {

				mid = start + (end - start) / 2;

				int pre = (mid - 1 + size) % size;
				int next = (mid + 1) % size;

				if (nums[mid] < nums[pre] && nums[mid] < nums[next]) {
					return mid;
				} else if (nums[start] < nums[end]) {
					return start;
				} else if (nums[start] < nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
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

	public static void main(String args[]) {

		// int[] nums = new int[] { 1,2,3,4,5,6,7 };
		int[] nums = new int[] { 2, 3, 4, 5, 6, 7, 1 };
		int count = -1;

		System.out.println("Original Array:");
		display(nums);

		System.out.println("\n\nFinding Rotation Count : ");
		count = findRotationalCount(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		System.out.println("Cout : " + count);

		count = findRotationalCount(new int[] { 7, 1, 2, 3, 4, 5, 6 });
		System.out.println("Cout : " + count);

		count = findRotationalCount(new int[] { 6, 7, 1, 2, 3, 4, 5 });
		System.out.println("Cout : " + count);

		count = findRotationalCount(new int[] { 5, 6, 7, 1, 2, 3, 4 });
		System.out.println("Cout : " + count);

		count = findRotationalCount(new int[] { 4, 5, 6, 7, 1, 2, 3 });
		System.out.println("Cout : " + count);

		count = findRotationalCount(new int[] { 3, 4, 5, 6, 7, 1, 2 });
		System.out.println("Cout : " + count);

		count = findRotationalCount(new int[] { 2, 3, 4, 5, 6, 7, 1 });
		System.out.println("Cout : " + count);

	}
}
