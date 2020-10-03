package manju;

import java.util.*;

public class Solutions{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			//Map<Integer,Integer> map = new HashMap<>();
			int[] a = new int[5];
			for(int i = 0; i < 5; i++) {
				a[i] = scan.nextInt();
				//map.put(a[i],i);
			}
			int[] b = a.clone();
			Arrays.sort(a);
			if(b[0] == a[4]) {
				System.out.println("Champions");
			}
			else {
				System.out.println(-1);
			}
		
		}
	}
}