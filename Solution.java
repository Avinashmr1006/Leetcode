package manju;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of packets");
		int n = scan.nextInt();
		//System.out.println("Enter the bucket size");
		int bs = 10;
		//System.out.println("Enter the flow rate");
		int fr = 4;
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the"+" "+i+"th"+" " + "packet size");
			a[i] = scan.nextInt();
		}
		solve(a,bs,fr);
		
	}
	public static void solve(int[] a,int bs,int fr) {
		int cur = 0;
		System.out.println("Packet Size"+"\t\t"+"Packets Sent"+"\t\t"+"Packets left"+"\t\t"+"Packets Dropped");
		for(int i = 0; i < a.length; i++) {
			cur += a[i];
			System.out.println(cur+"\t\t\t" + fr + "\t\t\t" + (bs - fr) + "\t\t\t" + (cur - bs));
			cur = (bs - fr);
		}
		while(cur > fr) {
			System.out.println(cur+"\t\t\t" + fr + "\t\t\t" + (cur - fr) + "\t\t\t" + "0");
			cur -= fr;
		}
		int x = cur;
		if(cur > 0) {
			System.out.println(cur+"\t\t\t" + cur + "\t\t\t" + (cur-x) + "\t\t\t" + "0");
		}
		
	}
}
