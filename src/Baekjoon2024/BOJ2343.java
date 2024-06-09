package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ2343 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        
        int bot = 0;
        int top = 0;
        for(int i=0;i<n;i++) {
        	int a = in.nextInt();
        	arr[i] = a;
        	top+=a;
        	bot = Math.max(a, bot);
        }
        // 9 22 45
         while(true) {
        	if(bot > top) {
        		break;
        	}
        	int mid = (bot+top)/2;
        	int cnt = 0;
        	int sum = 0;
        	for(int i=0;i<n;i++) {
        		
        		if(sum+arr[i] > mid) {
        			sum = 0;
        			cnt++;
        		}
        		sum += arr[i];
        	}
        	
        	if(sum !=0) {
        		cnt++;
        	}
        	
        	if(cnt<=m) {
        		top = mid - 1;
        	}else {
        		bot = mid + 1;
        	}
        	
        }
        System.out.println(bot);
    }
} 
