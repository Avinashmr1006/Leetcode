package manju;

import java.util.*;
public class hello {
	Random random = new Random();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] a = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = Random2();
			}
			
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();
		System.out.print("[");
		for(int i = 0; i < m; i++) {
			System.out.print("[");
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j]);
				if(j != n -1)System.out.print(",");
			}
			System.out.print("]");
			if(i != m -1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		
	}
	public static int Random2() {
		int upper = 3;
		int lower = 0;
		return (int) (Math.random() * (upper - lower)) + lower;
	}
}
