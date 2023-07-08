package subsequences;

import java.util.ArrayList;
import java.util.Stack;

public class PrintingSubsequences {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 2 };
		int n = 3;
		//we can take stack and arrayList both.
		//Stack<Integer> ds = new Stack<>();
		ArrayList<Integer> ds = new ArrayList<>();
		print(0, ds, arr, n);

	}

	private static void print(int i, ArrayList<Integer> ds, int[] arr, int n) {
		if (i == n) {
			if (ds.size() > 0) {
				System.out.println(ds);
			} else {
				System.out.println("{}");
			}
			return;
		}

		// not pick or not take condition , this element is not added to our
		// subsequence.
		print(i + 1, ds, arr, n);
		ds.add(arr[i]);
		// picked condition , this element is added to our
		// subsequence.
		print(i + 1, ds, arr, n);
		ds.remove(ds.size() - 1);
		
		//ds.pop();
	}
}
