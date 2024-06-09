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

public class BOJ25372 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	while(true) {
    		if(n==0) {
    			break;
    		}
    		String s=in.next();
    		if(6<=s.length() && s.length()<=9) {
    			System.out.println("yes");
    		}else {
    			System.out.println("no");
    		}
    		
    		n--;
    	}
    }
}