package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ1940 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = in.nextInt();
        }
        
        
        Arrays.sort(arr);
        
        int cnt = 0;
        int bot = 0;
        int top = n-1;
        while(true) {
        	int sum = arr[bot] + arr[top];
        	if(bot >= top) {
        		break;
        	}
        	
        	
        	if(sum == m) {
        		cnt++;
        		bot++;
        		top--;
        	}else if(sum > m) {
        		top--;
        	}else {
        		bot++;
        	}
        }
        System.out.println(cnt);
    }
} 
