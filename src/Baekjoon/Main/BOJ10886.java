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

public class BOJ10886 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	int a = 0;
    	int b = 0;
    	for(int i=0;i<n;i++) {
    		int m = in.nextInt();
    		if(m==0) {
    			a++;
    		}else {
    			b++;
    		}
    	}
    	
    	if(a>b) {
    		System.out.println("Junhee is not cute!");
    	}else {
    		System.out.println("Junhee is cute!");
    	}
    
    }
}