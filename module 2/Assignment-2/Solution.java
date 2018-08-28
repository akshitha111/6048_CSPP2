
import java.util.Scanner;
//import java.lang.Math;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation
	function and print the output.
	*/
	public static void rootsOfQuadraticEquation(final int p, final int q, final int r) {
		double d = Math.sqrt((q * q) - ((2 * 2) * p * r));
		double d1 = (-q + d) / (2 * p);
		double d2 = (-q - d) / (2 * p);
		System.out.println(d1 + " " + d2);



	}
}

