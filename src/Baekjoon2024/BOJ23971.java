package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ23971 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        
        int e = (a - 1) / (c + 1) + 1;
        int f = (b - 1) / (d + 1) + 1;
        
        System.out.println(e*f);
    }
} 
