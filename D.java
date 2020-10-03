package manju;

import java.util.*;


public class D {
	static int l = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			if(n == 1) {
				System.out.println(1);
			}
			else if(n % 2 == 0) {
				System.out.println(-1);
			}
			else {
				int[] a = new int[n];
				for(int i = 0; i < n; i++) {
					a[i] = i+1;
				}
				l = 0;
				heapPermutation(a,a.length,a.length);
			}
		}
    }
	public static void heapPermutation(int a[], int size, int n)
    {
        // if size becomes 1 then prints the obtained
        // permutation
		if(l == 1) {
			return;
		}
        if (size == 1)
            printArr(a, n);
 
        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);
 
            // if size is odd, swap 0th i.e (first) and
            // (size-1)th i.e (last) element
            if (size % 2 == 1) {
                int temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            }
 
            // If size is even, swap ith 
            // and (size-1)th i.e last element
            else {
                int temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }
	public static void printArr(int[] a, int n) {
		// TODO Auto-generated method stub
		int flag = 0;
		for(int i = 0; i < n - 1; i++) {
			if((a[i] & a[i+1]) > 0) {
				continue;
			}
			else {
				flag = 1;
				break;
			}
		}
		for(int i = 0; i < n && flag == 0; i++) {
			System.out.print(a[i]+" ");
			l = 1;
		}
	}
	
}
