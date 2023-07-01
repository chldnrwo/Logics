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

public class BOJ28281 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	int x = in.nextInt();
    	int[] arr = new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i] = in.nextInt();
    	}
    	
    	int[] arr2 = new int[n-1];
    	for(int i=0;i<n-1;i++) {
    		arr2[i] = arr[i] + arr[i+1];
    	}
    	Arrays.sort(arr2);
    	System.out.println(arr2[0] * x);
    }
    
}
