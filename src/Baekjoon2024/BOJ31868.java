package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ31868 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int m = in.nextInt();
       
       double tmp = Math.pow(2, n-1);
       
       double res = m / tmp;
       
       int r = (int) res;
       
       System.out.println(r);
    }
} 
