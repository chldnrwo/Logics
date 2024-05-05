package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31789 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
       int n = in.nextInt();
       int x = in.nextInt();
       int s = in.nextInt();
       
       boolean check = false;
       for(int i=0;i<n;i++) {
    	   int price = in.nextInt();
    	   int attack = in.nextInt();
    	   
    	   if(price <= x && attack > s) {
    		   check =true;
    	   }
       }
       
       
       if(check) {
    	   System.out.println("YES");
       }else {
    	   System.out.println("NO");
       }
    }
} 
