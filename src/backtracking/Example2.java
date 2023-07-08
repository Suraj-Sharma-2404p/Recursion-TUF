package backtracking;

import java.util.Scanner;

public class Example2 {
	public static void print(int i , int n) {
		if(i > n) {
			return;
		}else {
			print(i+1, n);
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number :");
		int n = scn.nextInt();
		print(1, n);
	}
}
