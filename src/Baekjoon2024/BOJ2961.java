package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2961 {
	static int n;
	static int[] arr;
	static int[] brr;
	static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	
    	n = in.nextInt();
    	arr = new int[n];
    	brr = new int[n];
    	
    	for(int i=0;i<n;i++) {
    		int s = in.nextInt();
    		int b = in.nextInt();
    		arr[i] = s;
    		brr[i] = b;
    	}
    	
    	bt(0,1,0,0);
    	System.out.println(answer);
    	
    }
    public static void bt(int level, int s, int b, int cnt) {
    	if(level == n) {
    		//교체
    		if(cnt !=0 && Math.abs(s-b) < answer) {
    			answer = Math.abs(s-b);
    		}
    		return;
    	}
    	//선택
    	bt(level+1, s*arr[level], b+brr[level], cnt+1);
    	//비선택
    	bt(level+1, s, b, cnt);
    }
    
}
//당장 생각나는건 브루트포스
//511가지 경우