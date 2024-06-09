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

public class BOJ5532 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	int l = in.nextInt();
    	int a = in.nextInt();
    	int b = in.nextInt();
    	int c = in.nextInt();
    	int d = in.nextInt();
    	
    	int res = (int)(l - (Math.max(a/(double)c, b/(double)d)));
    	System.out.println(res);
    }
}