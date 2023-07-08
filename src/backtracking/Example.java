package backtracking;

import java.util.Scanner;

public class Example {
	// print linearly from 1 to n.
	public static void print(int i , int n) {
		if(i < 1) {
			return;
		}else {
			print(i-1, n);
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter from where you want to print the numbers:");
		int n = scn.nextInt();
		print(n, n);
	}
}
