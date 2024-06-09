package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ2010 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
        
       int n=in.nextInt();
       
       int cnt = 1;
       for(int i=0;i<n;i++) {
    	   int a = in.nextInt();
    	   cnt--;
    	   cnt+=a;
       }
       System.out.println(cnt);
    }
} 
