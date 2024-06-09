package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ2512 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	int a = in.nextInt();
        	arr[i] = a;
        }
        Arrays.sort(arr);
        int m = in.nextInt();
        
        if((m/(double)n) < arr[0]) {
        	System.out.println(m/n);
        	System.exit(0);
        }
        
        for(int i=0;i<n-1;i++) {
        	m -= arr[i];
        	int tmp = m / (n-(i+1));
        	if(tmp < arr[i+1]) {
        		System.out.println(tmp);
        		System.exit(0);
        	}
        }
        
        System.out.println(arr[arr.length-1]);
    }
} 
