package functionalRecursion;

import java.util.Arrays;

public class ReverseAnArray {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void reverse(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		} else {
			swap(arr, start, end);
			reverse(arr, start + 1, end - 1);

		}
	}

	// using a single pointer
	static void reverse2(int[] arr, int i) {
		int n = arr.length;
		if (i >= n / 2) {
			return;
		} else {
			swap(arr, i, n - i - 1);
			reverse2(arr, i + 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4 };
		reverse(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		reverse2(arr2, 0);
		System.out.println(Arrays.toString(arr2));
	}

}
