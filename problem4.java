package manju;
import java.util.*;
public class problem4 {
	Random random = new Random();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			sb.append(String.valueOf(Random2()));
		}
		String k = sb.toString();
		System.out.println(k);
		StringBuilder sb1 = new StringBuilder();
		for(char x : k.toCharArray()) {
			if(x == '0') {
				sb1.append('R');
			}
			else {
				sb1.append('L');
			}
		}
		System.out.println(sb1.toString());
	}
	public static int Random2() {
		int upper = 2;
		int lower = 0;
		return (int) (Math.random() * (upper - lower)) + lower;
	}
}
