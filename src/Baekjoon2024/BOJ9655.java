package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ9655 {
	
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        /* 1000개정도면 시뮬돌려도 되지 않을까*/
        
         int tmp = n/3;
         boolean turn = false;
         if(tmp%2!=0) {
        	 turn = true;
         }
         
         n%=3;
         if(n%2==0) {
        	 if(turn) {
        		 System.out.println("SK");
        	 }else {
        		 System.out.println("CY");
        	 }
        	 
         }else {
        	 if(turn) {
        		 System.out.println("CY");
        	 }else {
        		 System.out.println("SK");
        	 }
         }
         
    }
    
  
} 
 