package Baekjoon2024;
import java.util.*;
import java.io.*;
 

 
class BOJ11727 {
	static int[] arr;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        arr = new int[1001];
        arr[1] = 1;
        arr[0] = 0;
        arr[2] = 3;
        
        System.out.println(dp(n));
    }
    public static int dp(int num) {
    	if(arr[num]==0) {
    		arr[num] = (dp(num-2)*2 + dp(num-1))%10007;
    	}
    	
    	return arr[num];
    }
}