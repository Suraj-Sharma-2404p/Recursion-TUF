package basics;

import java.util.Scanner;

public class BasicExample {

	// print name n number of times using recursion
	public static void print(int i, int n) {
		if (i > n) {
			return;
		} else {
			System.out.println("raj");
			print(i + 1, n);
		}
	}
	
	//print linearly from 1 to N.
	public static void print2(int i , int n) {
		if(i > n) {
			return;
		}else {
			System.out.println(i);
			print2(i+1, n);
		}
	}
	// print from n to 1;
	public static void print3(int i , int n) {
		if(i < 1) {
			return;
		}else {
			System.out.println(i);
			print3(i-1, n);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of times you want to print the number :");
		int n = scn.nextInt();
		//print(1, n);
		//print2(1, n);
		print3(n, n);
	}

}
