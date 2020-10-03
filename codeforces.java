package manju;
import java.util.*;

public class codeforces{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] a = new int[n];
			int flag = 0;
			for(int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			int[] b = new int[n];
			for(int i = 0; i < n; i++) {
				b[i] = i+1;
			}
			for(int i = 0; i < n; i++) {
				if(b[i] % b[i] == 0) {
					continue;
				}
				else {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
		
		
}