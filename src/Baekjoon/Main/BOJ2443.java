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

public class BOJ2443 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	
    	for(int i=0;i<n;i++) {//0 1 2 3 4
    		for(int j=0;j<i;j++) { //
    			System.out.print(" ");
    		}
    		
    		for(int j=0;j<(n-i-1) * 2 + 1;j++) {//4 3 2 1 0
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    
}
