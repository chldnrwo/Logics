package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31821 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int cnt = 0;
       int[] arr = new int[n];
       
       for(int i=0;i<n;i++) {
    	   arr[i] = in.nextInt();
       }
       int m = in.nextInt();
      
       for(int i=0;i<m;i++) {
    	   int a = in.nextInt();
    	   cnt+=arr[a-1];
       }
       System.out.println(cnt);
       
    }
} 
