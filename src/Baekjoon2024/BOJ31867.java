package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31867 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       String s = in.next();
       
       int odd = 0;
       int even = 0;
       
       for(int i=0;i<n;i++) {
    	   int a = Integer.parseInt(s.substring(i, i+1));
    	   
    	   if(a%2==0) {
    		   even++;
    	   }else {
    		   odd++;
    	   }
       }
       
       
       if(odd>even) {
    	   System.out.println(1);
       }else if(odd < even) {
    	   System.out.println(0);
       }else {
    	   System.out.println(-1);
       }
       
    }
} 
