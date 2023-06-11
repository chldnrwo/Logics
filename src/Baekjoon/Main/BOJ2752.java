package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ2752 {
    public static void main(String[] args) throws IOException {
        
    	Scanner in = new Scanner(System.in);
    	
    	int[] arr = new int[3];
    	for(int i=0;i<3;i++) {
    		arr[i] = in.nextInt();
    	}
    	Arrays.sort(arr);
    	for(int i=0;i<3;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}

