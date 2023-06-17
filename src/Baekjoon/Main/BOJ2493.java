package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ2493 {
    public static void main(String[] args) throws IOException {
        
    	//Scanner in = new Scanner(System.in);
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	int n = Integer.parseInt(br.readLine());
    	Stack<Pair> stack = new Stack<>();
    	StringBuilder sb = new StringBuilder();
    	int[] arr = new int[n];
    	
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0;i<n;i++) {
    		int height = Integer.parseInt(st.nextToken());
    		//stack.push(new Pair(i, a));
    		
    		while(!stack.empty()) {
    			if(height < stack.peek().height) {
    				sb.append(stack.peek().index+" ");
    				break;
    			}
    			stack.pop();
    		}
    		if(stack.empty()) {
    			sb.append(0+" ");
    		}
    		stack.push(new Pair(i+1, height));
    	}
    	System.out.println(sb);
    	
    	
    	
    	
    }
    static class Pair{
    	int index;
    	int height;
    	
		Pair(int index, int height) {
			this.index = index;
			this.height = height;
		}
    }
}

