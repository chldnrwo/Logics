package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1406 {

    public static void main(String[] args) throws IOException {
        //Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    	String s = br.readLine();
    	Stack<Character> stackL = new Stack<>();
    	Stack<Character> stackR = new Stack<>();
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		stackL.push(c);
    	}
    	
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String p = st.nextToken();
        	if(p.equals("L") && !stackL.isEmpty()) {
        		char c = stackL.pop();
        		stackR.push(c);
        	}else if(p.equals("D") && !stackR.isEmpty()) {
        		char c = stackR.pop();
        		stackL.push(c);
        	}else if(p.equals("B") && !stackL.isEmpty()) {
        		char c = stackL.pop();
        	}else if(p.equals("P")) {
        		char c = st.nextToken().charAt(0);
                stackL.push(c);
        	}
        	//System.out.println(stackL.toString() + "  " + stackR.toString());
        }
        
        while (!stackL.isEmpty()) {
            sb.append(stackL.pop());
        }
        sb.reverse();
        while (!stackR.isEmpty()) {
            sb.append(stackR.pop());
        }
        System.out.println(sb);
    }
}
