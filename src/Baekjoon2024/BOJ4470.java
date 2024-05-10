package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ4470 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       String ss = in.nextLine();
       int n = Integer.parseInt(ss);
       for(int i=1;i<=n;i++) {
    	   String s = in.nextLine();
    	   System.out.println(i+". "+s);
       }
    }
} 
