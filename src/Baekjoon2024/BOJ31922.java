package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31922 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int a = in.nextInt();
       int p = in.nextInt();
       int c = in.nextInt();
       
       System.out.println(Math.max(a+c, p));
    }
} 