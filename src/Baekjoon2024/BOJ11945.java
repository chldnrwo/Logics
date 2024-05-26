package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ11945 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int m = in.nextInt();
       StringBuilder sb;
       
       if(m==0 || n==0) {
    	   return;
       }
       
       for(int i=0;i<n;i++) {
    	  String s = in.next();
    	  sb = new StringBuilder(s);
    	  System.out.println(sb.reverse().toString());
       }
    }
} 