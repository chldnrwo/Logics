package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31831 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int m = in.nextInt();
       int cnt = 0;
       int tot = 0;
       for(int i=0;i<n;i++) {
    	   int a = in.nextInt();
    	   tot += a;
    	   if(tot<0) {
    		   tot = 0;
    	   }
    	   
    	   if(tot>=m) {
    		   cnt++;
    	   }
       }
       System.out.println(cnt);
    }
} 
