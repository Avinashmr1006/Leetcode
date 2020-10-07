import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     static int jumpingOnClouds(int c[], int k){
        int e = 100;
        int len = c.length;
        for(int i=0; i<len; i++){
            if(c[j] == 0){
                e = e-1;
                i = i+k;
            }
            else if(c[j] == 1){
                e = e-2;
                i = i+k;
            }
            else 
            return -1;
        }
        if(i > len){
            c[i] = c[0];
        }
        return e;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        for(int i=0; i<n; i++){
            c[i] = sc.nextInt();
        }
        int result = jumpingOnClouds();
        System.out.println(result);
    }
}

