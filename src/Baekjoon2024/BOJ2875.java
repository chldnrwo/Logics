package Baekjoon2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BOJ2875{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		
		int count =0;

        while(n>=2 && m>=1 && m+n >=3+k){
            n = n-2;
            m= m-1;
            count++;
        }
        System.out.println(count);
		
	}
}

