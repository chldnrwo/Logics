package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31798 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
        
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       
       if(a==0) {
    	   System.out.println(c*c - b);
       }else if(b==0) {
    	   System.out.println(c*c - a);
       } else if(c==0) {
    	   System.out.println( (int)Math.sqrt(a+b) );
       }
    }
} 
