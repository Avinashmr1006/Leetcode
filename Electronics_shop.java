import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        // Complete this function
        int result=0;
        for(int i=0; i<keyboards.length;i++){
            for(int j=0; j<drives.length;j++){
                if((keyboards[i]+drives[j])>result && (keyboards[i]+drives[j])<=s){
                    result = keyboards[i]+drives[j];
                }
            }
        }
        if(result==0){
            return -1;
        }
        else return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
    
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}

