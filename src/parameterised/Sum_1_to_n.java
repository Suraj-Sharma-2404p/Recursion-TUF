package parameterised;

import java.util.Scanner;

public class Sum_1_to_n {
	public static void sum(int i , int sum) {
		if(i < 1) {
			System.out.println(sum);
			return;
		}
		sum(i-1,sum+i);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter upto where you want sum::");
		int n = scn.nextInt();
		sum(n, 0);
		scn.close();
	}

}
