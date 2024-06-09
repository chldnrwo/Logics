package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ19939 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        
        int tmp = k*(k+1) / 2;
        
        if(n < tmp) {
        	System.out.println(-1);
        }else {
        	int a = (n-tmp)%k;
        	if(a==0) {
        		System.out.println(k-1);
        	}else {
        		System.out.println(k);
        	}
        }
    }
} 
