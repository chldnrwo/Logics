package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ18110 {
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(br.readLine());
    	int m = (int)Math.round(n * 0.15);
    	//System.out.println(n+" "+m);
    	
    	int[] arr = new int[n];
    	
    	for(int i=0;i<n;i++) {
    		int x = Integer.parseInt(br.readLine());
    		arr[i] = x;
    	}
    	
    	Arrays.sort(arr);
    	double sum = 0;
    	for(int i=m;i<n-m;i++) {
    		sum+=arr[i];
    	}
    	double cnt = n - 2 * m;
    	int res = (int)Math.round(sum/cnt);
    	
    	System.out.println(res);
    }
}

