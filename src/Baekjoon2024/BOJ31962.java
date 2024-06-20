package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOJ31962 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       int n = in.nextInt();
       int x = in.nextInt();
       
       int max = -1;
       int check =0;
       for(int i=0;i<n;i++) {
    	   int a = in.nextInt();
    	   int b = in.nextInt();
    	   if(a+b <= x) {
    		   max = Math.max(max, a);
    	   }
       }
       System.out.println(max);
       
    }
}

/*
 * 
 * 1212
 * 12123
 * 121212
 * 1212123
 */