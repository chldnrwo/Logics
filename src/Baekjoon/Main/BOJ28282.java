package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ28282 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	
    	int x = in.nextInt();
    	int k = in.nextInt();
    	
    	int[] arrL = new int[k+1];
    	int[] arrR = new int[k+1];
    	
    	for(int i=0;i<x;i++) {
    		int a = in.nextInt();
    		arrL[a]++;
    	}
    	for(int i=0;i<x;i++) {
    		int a = in.nextInt();
    		arrR[a]++;
    	}
    	
    	long res = 0;
    	for(int cnt : arrR) {
    		res+=cnt;
    	}
    	long result = 0;
    	for(int i=1;i<=k;i++) {
    		result += arrL[i] * (res - arrR[i]); 
    	}
    	System.out.println(result);
    }
    
}
