package manju;

import java.util.Scanner;
public class megha {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] ch = s.toCharArray();
		int one = 0,zer = 0;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == '1') {
				one++;
			}
			else {
				zer++;
			}
		}
		System.out.println("ONES " + one + "zero " + zer);
		
	}
}
