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

public class BOJ2576 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	
    	int sum = 0;
    	int min = Integer.MAX_VALUE;
    	for(int i=0;i<7;i++) {
    		int n = in.nextInt();
    		if(n%2!=0) {
    			sum+=n;
    			if(n<min) {
        			min = n;
        		}
    		}
    		
    	}
    	if(sum==0 && min==Integer.MAX_VALUE) {
    		System.out.println(-1);
    		System.exit(0);
    	}
    	System.out.println(sum);
    	System.out.println(min);
    	
    	
    }
}