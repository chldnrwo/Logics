package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ28214 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
       int n = in.nextInt();
       int k = in.nextInt();
       int p = in.nextInt();
       int cnt2 = 0;
       for(int i=0;i<n;i++) {
    	   int cnt = 0;
    	   for(int j=0;j<k;j++) {
    		   int a = in.nextInt();
        	   if(a==0) {
        		   cnt++;
        	   }
           } 
    	   if(cnt < p) {
    		   cnt2++;
    	   }
       }
       System.out.println(cnt2);
    }
} 
