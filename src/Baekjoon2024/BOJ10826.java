package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ10826 {
	static BigInteger[] arr;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        arr= new BigInteger[10001];
        arr[0] = new BigInteger("0");
        arr[1] = new BigInteger("1");
        
        
        System.out.println(dp(n));
        
    }
    public static BigInteger dp(int num) {
    	if(arr[num] == null && num!=0) {
    		arr[num] = dp(num-2).add(dp(num-1));
    	}
    	
    	
    	return arr[num];
    }
  
} 
 