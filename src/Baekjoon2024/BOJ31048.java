package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31048 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       
       for(int i=0;i<n;i++) {
    	   int a = in.nextInt();
    	   
    	   if(a>=5) {
    		   System.out.println(0);
    	   }else {
    		   if(a==1) {
    			   System.out.println(1);
    		   }else if(a==2) {
    			   System.out.println(2);
    		   }else if(a==3) {
    			   System.out.println(6);
    		   }else if(a==4) {
    			   System.out.println(4);
    		   }
    	   }
       }
       
    }
} 