package manju;

import java.util.Scanner;

public class Arthmatic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    //System.out.print("Case #" + (cases+1) + ": ");
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int[] dif = new int[n-1];
		for(int i = 0; i < n-1; i++) {
			dif[i] = a[i+1] - a[i];
			//System.out.println(dif[i]);
		}
		
		int cur = 1,ans = 1;
		
		for(int i = 1; i < n - 1; i++) {
		    if(dif[i] == dif[i-1]){
		        cur++;
		    }
		    else{
		        cur = 1;
		    }
		    ans = Math.max(ans,cur);
		}
		//max++;
		System.out.println(ans+1);
	}
	
}
