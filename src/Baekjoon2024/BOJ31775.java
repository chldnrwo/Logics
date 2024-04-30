package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31775 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
       String s1 = in.next();
       String s2 = in.next();
       String s3 = in.next();
       
       boolean l = false;
       boolean k = false;
       boolean p = false;
       
       
       
       if(s1.charAt(0)=='l') {
    	   l = true;
       }else if(s1.charAt(0)=='k') {
    	   k = true;
       }else if(s1.charAt(0)=='p') {
    	   p = true;
       }
       if(s2.charAt(0)=='l') {
    	   l = true;
       }else if(s2.charAt(0)=='k') {
    	   k = true;
       }else if(s2.charAt(0)=='p') {
    	   p = true;
       }
       if(s3.charAt(0)=='l') {
    	   l = true;
       }else if(s3.charAt(0)=='k') {
    	   k = true;
       }else if(s3.charAt(0)=='p') {
    	   p = true;
       }
       
       
       if(l&&k&&p) {
    	   System.out.println("GLOBAL");
       }else {
    	   System.out.println("PONIX");
       }
    }
} 
