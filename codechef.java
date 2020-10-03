package manju;
import java.util.*;
public class codechef {
	private static int decodeSingle(char letter) {
		switch(letter) {
			case 'M': return 1000;
			case 'D': return 500;
			case 'C': return 100;
			case 'L': return 50;
			case 'X': return 10;
			case 'V': return 5;
			case 'I': return 1;
			default: return 0;
		}
	}
	public static int decode(String roman) {
		int result = 0;
		String uRoman = roman.toUpperCase(); //case-insensitive
		for(int i = 0;i < uRoman.length() - 1;i++) {//loop over all but the last character
			//if this character has a lower value than the next character
			if (decodeSingle(uRoman.charAt(i)) < decodeSingle(uRoman.charAt(i+1))) {
				//subtract it
				result -= decodeSingle(uRoman.charAt(i));
			} else {
				//add it
				result += decodeSingle(uRoman.charAt(i));
			}
		}
		//decode the last character, which is always added
		result += decodeSingle(uRoman.charAt(uRoman.length()-1));
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] s = new String[n];
		for(int i = 0; i < n; i++) {
			s[i] = scan.nextLine();
		}
		Arrays.sort(s,new Comparator<String>() {
			@Override
			public int compare(String s1,String s2)
		    {
		        String[] one = s1.split(" ");
		        String[] two = s2.split(" ");
		        /* for ascending order */
		        if(one[0].equals(two[0])) {
		        	if(decode(one[1]) < decode(two[1])) {
		        		return -1;
		        	}
		        	if(decode(one[1]) > decode(two[1])){
		        		return 1;	
		        	}
		        }
		        else {
		        	return s1.compareTo(s2);
		        }
		        return 0;
		    }
		});
		for(int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
