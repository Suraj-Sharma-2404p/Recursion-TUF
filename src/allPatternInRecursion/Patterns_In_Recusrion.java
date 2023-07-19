package allPatternInRecursion;

import java.util.ArrayList;

public class Patterns_In_Recusrion {
	// printing subsequences whose sum = k
	private static void print(int index, ArrayList<Integer> ds, int sum, int sumRequired, int sizeOfArray, int[] arr) {
		if (index == sizeOfArray) {
			if (sum == sumRequired) {
				System.out.println(ds);
			}
			return;
		}
		ds.add(arr[index]);
		sum += arr[index];
		print(index + 1, ds, sum, sumRequired, sizeOfArray, arr);
		sum -= arr[index];
		ds.remove(ds.size() - 1);
		print(index + 1, ds, sum, sumRequired, sizeOfArray, arr);

	}
	
	//what if we are told to print only first subsequence
	private static boolean print2(int index , ArrayList<Integer> ds, int sum ,int sumRequired , int sizeOfArray , int[] arr) {
		if(index == sizeOfArray) {
			if(sum == sumRequired) {
				System.out.println(ds);
				return true;
			}else {
				return false;
			}
		}
		
		ds.add(arr[index]);
		sum += arr[index];
		if(print2(index+1, ds, sum, sumRequired, sizeOfArray, arr) == true) {
			return true;
		}
		sum -= arr[index];
		ds.remove(ds.size()-1);
		if(print2(index+1, ds, sum, sumRequired, sizeOfArray, arr) == true) {
			return true;
		}
		return false;
	}
	
	//return count of subsequences
	
	public static int print3(int index , int sum , int sumRequired, int sizeOfArray ,int[] arr) {
		if(index == sizeOfArray) {
			if(sum == sumRequired) {
				return 1;
			}else {
				return 0;
			}
		}
		sum+= arr[index];
		//when picked!!
		int left = print3(index+1, sum, sumRequired, sizeOfArray, arr);
		sum -= arr[index];
		//when not picked!!
		int right = print3(index+1, sum, sumRequired, sizeOfArray, arr);
		return left+right;
	}
	
	

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		int n = arr.length;
		ArrayList<Integer> ds = new ArrayList<>();
		print(0, ds, 0, 2, n, arr);
		print2(0, ds, 0, 2, n, arr);
		
		System.out.println(print3(0, 0, 2, n, arr));
	}

}
