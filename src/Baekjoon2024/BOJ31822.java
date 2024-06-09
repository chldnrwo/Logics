package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31822 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       String s = in.next();
       
       int n = in.nextInt();
       int cnt =0 ;
       for(int i=0;i<n;i++) {
    	   String s1 = in.next();
    	   if(s.substring(0, 5).equals(s1.substring(0, 5))) {
    		   cnt++;
    	   }
    	   
       }
       System.out.println(cnt);
    }
} 
