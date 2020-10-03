package manju;

import java.util.Random;
import java.util.Scanner;

public class randomArthmatic {
	Random random = new Random();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int m = scan.nextInt();
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print(Random2()+" ");
		}
		
	}
	public static int Random2() {
		int upper = 10;
		int lower = 7;
		return (int) (Math.random() * (upper - lower)) + lower;
	}
}
