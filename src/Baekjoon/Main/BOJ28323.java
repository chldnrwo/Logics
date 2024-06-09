package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ28323 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] arr = new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i] = in.nextInt();
    	}
    	
    	int cnt = 1;
    	for(int i=0;i<n-1;i++) {
    		if(arr[i]%2 != arr[i+1]%2) {
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    }
}