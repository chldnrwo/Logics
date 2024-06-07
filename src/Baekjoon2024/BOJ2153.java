package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ2153 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       String s = in.next();
       
       int res = 0;
       
       for(int i=0;i<s.length();i++) {
    	   char c = s.charAt(i);
    	   
    	   if(c>=97) {
    		   c-=96;
    	   }else if(c<97) {
    		   c-=38;
    	   }
    	   
    	   res+=c;
       }
       
       if(res==1) {
    	   System.out.println("It is a prime word.");
    	   return;
       }
       
       
       for(int i=2;i*i<=res;i++) {
    	   if(res%i==0) {
    		   System.out.println("It is not a prime word.");
    		   return;
    	   }
       }
       
       System.out.println("It is a prime word.");
    }
} 