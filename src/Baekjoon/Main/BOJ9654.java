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

public class BOJ9654 {

    public static void main(String[] args) throws IOException {
//
//    	Scanner in = new Scanner(System.in);
//    	int n = in.nextInt();
//    	
//    	int[][] arr = new int[n][n];
//    	for(int i=0;i<n;i++) {
//    		for(int j=0;j<n;j++) {
//        		arr[i][j] = in.nextInt();
//        	}
//    	}
    	
    	System.out.printf("%-15s%-15s%-11s%-10s\n", "SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE");
        System.out.printf("%-15s%-15s%-11s%-10s\n", "N2 Bomber", "Heavy Fighter", "Limited", "21");
        System.out.printf("%-15s%-15s%-11s%-10s\n", "J-Type 327", "Light Combat", "Unlimited", "1");
        System.out.printf("%-15s%-15s%-11s%-10s\n", "NX Cruiser", "Medium Fighter", "Limited", "18");
        System.out.printf("%-15s%-15s%-11s%-10s\n", "N1 Starfighter", "Medium Fighter", "Unlimited", "25");
        System.out.printf("%-15s%-15s%-11s%-10s\n", "Royal Cruiser", "Light Combat", "Limited", "4");
    }
}