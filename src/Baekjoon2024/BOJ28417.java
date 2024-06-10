package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOJ28417 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
     
       int n = in.nextInt();
       int max = 0;
       for(int i=0;i<n;i++) {
    	   int res = 0;
    	   int a1 = in.nextInt();
    	   int a2 = in.nextInt();
    	   res += Math.max(a1, a2);
    	   
    	   int[] arr = new int[5];
    	   for(int j=0;j<5;j++) {
    		   arr[j] = in.nextInt();
    	   }
    	   Arrays.sort(arr);
    	   res+=(arr[3]+arr[4]);
    	   
    	   max = Math.max(max, res);
       }
       
       System.out.println(max);
    }
}