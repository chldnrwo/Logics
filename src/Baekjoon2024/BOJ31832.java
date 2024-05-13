package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31832 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       
       for(int i=0;i<n;i++) {
    	   String s = in.next();
    	   
    	   if(s.length()>10) {
     		  continue; 
     	   }
    	   
    	   int big = 0;
    	   int small = 0;
    	   int init = 0;
    	   for(int j=0;j<s.length();j++) {
    		    char c = s.charAt(j);
    		    
    		    if(65<=c && c<91) {
    		    	big++;
    		    }else if(48<=c && c<58) {
    		    	init++;
    		    }else if(97<=c && c<123) {
    		    	small++;
    		    }
    		    
    	   }
    	   
    	   if(big > small) {
      		  continue; 
      	   }else if(init == s.length()) {
      		   continue;
      	   }
    	   System.out.println(s);
    	   System.exit(0);
       }
    }
} 
