package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31866 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int m = in.nextInt();
       
       if(n==m) {
    	   System.out.println("=");
       }else {
    	   if(n==0 && m==2) {
    		   System.out.println(">");
    	   }else if(n==0 && m==5) {
    		   System.out.println("<");
    	   }else if(n==2 && m==5) {
    		   System.out.println(">");
    	   }else if(n==2 && m==0) {
    		   System.out.println("<");
    	   }else if(n==5 && m==2) {
    		   System.out.println("<");
    	   }else if(n==5 && m==0) {
    		   System.out.println(">");
    	   }else if(n!=0 && n!=2 && n!=5 && m!=0 && m!=2 && m!=5) {
        	   System.out.println("=");
           }else if(n!=0 && n!=2 && n!=5) {
        	   System.out.println("<");
           }else if(m!=0 && m!=2 && m!=5) {
        	   System.out.println(">");
           }
       }
       
       
    }
} 
