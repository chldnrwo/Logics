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

public class BOJ17608 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int ruler = 0;
    	int cnt = 0;
    	int n = in.nextInt();
    	int[] arr = new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i] = in.nextInt();
    	}
    	
    	for(int i = n-1;i>=0;i--) {	
    		if(ruler < arr[i]) {
    			ruler = arr[i];
    			cnt++;
    		}
    	}
    	System.out.println(cnt);
    	
    }
}