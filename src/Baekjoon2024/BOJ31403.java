package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31403 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       
       String a1 = String.valueOf(a);
       String b1 = String.valueOf(b);
       
       int res = Integer.valueOf(a1+b1) - c;
       System.out.println(a+b-c);
       System.out.println(res);
       
    }
} 