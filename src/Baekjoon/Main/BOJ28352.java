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

public class BOJ28352 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	long sum = 1;
    	for(int i=n;i>=1;i--) {
    		sum *= i;
    	}
    	//System.out.println(sum);
    	sum /= (60*60*24*7);
    	System.out.println(sum);
    }
}