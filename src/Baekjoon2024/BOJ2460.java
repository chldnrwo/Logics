package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ2460 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int max = 0;
        int cnt = 0;
        for(int i=0;i<10;i++) {
        	int a =in.nextInt();
        	int b =in.nextInt();
        	
        	cnt = cnt - a + b;
        	max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
    
  
  
} 
 