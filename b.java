package manju;

import java.util.*;


public class b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int[] b = new int[n];
		int even = 0,odd = n - 1;
		for(int i = 0; i < n; i++) {
			if(a[i] % 2 == 0) {
				b[even] = a[i];
				even++;
			}
			else {
				b[odd] = a[i];
				odd--;
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		
	}
}
