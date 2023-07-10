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

public class BOJ28289 {

    public static void main(String[] args) throws IOException {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] arr = new int[4];
    	for(int i=0;i<n;i++) {
    		int a =in.nextInt();
    		int b =in.nextInt();
    		int c =in.nextInt();
    		
    		if(a==1) {
    			arr[3]++;
    		}else if(a!=1 && (b==1||b==2)) {
    			arr[0]++;
    		}else if(a!=1 && b==3) {
    			arr[1]++;
    		}else if(a!=1 && b==4) {
    			arr[2]++;
    		}
    	}
    	
    	for(int i=0;i<4;i++) {
    		System.out.println(arr[i]);
    	}
    	
    }
}