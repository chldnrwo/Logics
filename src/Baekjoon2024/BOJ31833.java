package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31833 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       String tot1 = "";
       String tot2 = "";
       for(int i=0;i<n;i++) {
    	 String s = in.next();
    	 tot1+=s;
       }
       for(int i=0;i<n;i++) {
      	 String s = in.next();
      	 tot2+=s;
        }
       long t1 = Long.parseLong(tot1);
       long t2 = Long.parseLong(tot2);
       
       long res = Math.min(t1, t2);
       System.out.println(res);
    }
} 
