package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ13300 {
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	int[][] arr = new int[2][7];
    	
    	for(int i=0;i<n;i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		
    		arr[a][b]++;
    	}
    	
    	int room = 0;
    	for(int i=0;i<2;i++) {
    		for(int j=1;j<7;j++) {
    			int tmp = arr[i][j];
    			if(tmp%k==0) {
    				room+=(tmp/k);
    			}else {
    				room+=(tmp/k+1);
    			}
    		}
    	}
    	System.out.println(room);
    }

   
}