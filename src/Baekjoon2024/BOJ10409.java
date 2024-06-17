package Baekjoon2024;
import java.util.*;
import java.io.*;

class BOJ10409 {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       int n = in.nextInt();
       
       int t = in.nextInt();
       
       
       int[] arr = new int[n];
       
       for(int i=0;i<n;i++) {
    	   int a = in.nextInt();
    	   arr[i] = a;
       }
       
       Deque<Integer> dq = new LinkedList<>();
       int idx = 0;
       int max = 0;
       for(int i=0;i<n;i++) {
 
    	   if(max+arr[i] <= t) {
    		  max += arr[i];
    		  idx++;
    	  }else {
    		  break;
    	  }
       }
       
       System.out.println(idx);
       
    }
}