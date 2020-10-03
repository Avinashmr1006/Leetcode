package manju;

import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int l = scan.nextInt();
			int flag = 0;
			int[] b = new int[k];
			for(int i = 0; i < k; i++) {
				b[i] = i+1;
				//System.out.print(b[i] + " ");
			}
			if(n>k*l || (n>1 && k==1))
			       System.out.println("-1");
			else {
				HashMap<Integer,Integer> map = new HashMap<>();
				int[] a = new int[n];
				for(int x : b) {
					map.put(x,0);
				}
				int count = 0;
				for(int i = 0; i < n; i++) {
					if(map.containsKey(b[i % k]) && map.get(b[i % k]) < l) {
						a[i] = b[i % k];
						map.put(a[i],map.getOrDefault(a[i],0)+1);
					}
					else {
						flag = 1;
						break;
					}
				}
				//System.out.println();
				if(flag == 1) {
					System.out.println("-1");
				}
				else {
					for(int i = 0; i < n; i++) {
						System.out.print(a[i] + " ");
					}
				}
			}
			
		}
		
		
	}

}
