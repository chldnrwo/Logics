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

public class BOJ9093 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int n = in.nextInt();
    	in.nextLine();
    	for(int i=0;i<n;i++) {
    		String s = in.nextLine();
    		String[] words = s.split(" ");
    		for(int j=0;j<words.length;j++) {
    			String s2 = words[j];
    			StringBuilder sb2 = new StringBuilder(s2);
    			words[j] = sb2.reverse().toString();
    		}
    		//System.out.println(Arrays.toString(words));
    		String reversedStr = String.join(" ", words);
    		
    		sb.append(reversedStr).append("\n");
    	}
    	System.out.println(sb);
    }
}