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

public class BOJ4796 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int cnt = 0;
    	while(true) {
    		int l = in.nextInt();
    		int p = in.nextInt();
    		int v = in.nextInt();
    		cnt++;
    		if(l==0 && p==0 && v==0) {
    			break;
    		}
    		int sum = 0;
    		if(v%p < l) {
    			sum = v/p*l + (v%p);
    		}else {
    			sum = v/p*l + l;
    		}
    		
    		
    		
    		System.out.println("Case "+cnt+": "+sum);
    	}
    }
}