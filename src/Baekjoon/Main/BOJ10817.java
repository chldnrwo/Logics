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

public class BOJ10817 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	
    	int[] arr = new int[3];
    	for(int i=0;i<3;i++) {
    		arr[i] = in.nextInt();
    	}
    	Arrays.sort(arr);
    	System.out.println(arr[1]);
    
    }
}