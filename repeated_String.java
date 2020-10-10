import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long n = sc.nextLong();

    long count = 0;
    long totalCount = 0;

    for(int i = 0; i < s.length(); i++)
    {
        if(s.charAt(i) == 'a')
        {
            count++;
        }
    }
    long divisor = n / s.length();
    totalCount += divisor * count;

    long remainder = n % s.length();
    for(int i=0; i < remainder; i++)
    {
       if(s.charAt(i) == 'a')
       {
           totalCount++;
       }
    }
    System.out.println(totalCount);
 }
}

