package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ2193 {
	static BigInteger[] arr;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        arr = new BigInteger[91];
        arr[1] = new BigInteger("1");
        arr[2] = new BigInteger("1");	
        /*
         시뮬로 돌릴 경우
         N 최대 90 규칙을 찾아야댜ㅚㅁ
         1
         1
         2
         3
         5
         
         
         10000
         10001
         10010
         10100
         10101
        */
        System.out.println(dp(n));
    }
    public static BigInteger dp(int num) {
    	if(arr[num] == null) {
    		arr[num] = dp(num-1).add(dp(num-2));
    	}
    	
    	return arr[num];
    }
  
  
} 
 