package Baekjoon2024;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2578 {
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	
    	int[] arr = new int[26];
    	int[] brr = new int[26];
    	boolean[][] barr = new boolean[5][5];
    	
    	
    	for(int i=0;i<5;i++) {
    		for(int j=0;j<5;j++) {
    			int a = in.nextInt();
        		arr[a] = i;
        		brr[a] = j;
        		
        	}
    	}
    	int res = 0;
    	
//    	for(int i=0;i<11;i++) {
//    		int b=in.nextInt();
//    		barr[arr[b]][brr[b]] = true;
//    	}
    	
    	for(int i=0;i<25;i++) {
    		int b=in.nextInt();
    		barr[arr[b]][brr[b]] = true;
    		
    		if(bingo(barr)>=3 && res==0) {
    			res = i+1;
    		}
    	}
    	
    	System.out.println(res);
    	
    	
    	//System.out.println(arr[11]+ brr[11]);
    	
    	
    }
    public static int bingo(boolean[][] arr) {
    	int cnt = 0;
    	
    	for(int i=0;i<5;i++) {
    		if(arr[i][0] &&
    			arr[i][1] &&
    			arr[i][2] &&
    			arr[i][3] &&
    			arr[i][4]
    				) {
    			cnt++;
    		}
    	}
    	for(int i=0;i<5;i++) {
    		if(arr[0][i] &&
    			arr[1][i] &&
    			arr[2][i] &&
    			arr[3][i] &&
    			arr[4][i]
    				) {
    			cnt++;
    		}
    	}
    	
    	
    		if(arr[0][0] &&
    			arr[1][1] &&
    			arr[2][2] &&
    			arr[3][3] &&
    			arr[4][4]
    				) {
    			cnt++;
    		}
    	
    		if(arr[0][4] &&
        			arr[1][3] &&
        			arr[2][2] &&
        			arr[3][1] &&
        			arr[4][0]
        				) {
        			cnt++;
        		}
    	
    	return cnt;
    }

   // 3빙고는 아무리 빨라도 12부터 가능
}