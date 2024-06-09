package Baekjoon2024;
import java.util.*;
import java.io.*;
 

 
class BOJ15663 {
	static StringBuilder sb;
	static int n,m;
	static int[] arr, res;
	static boolean[] check;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        sb = new StringBuilder();
        n = in.nextInt();
        m = in.nextInt();
        
        arr = new int[n];
        res = new int[n];
        check = new boolean[n];
        for(int i=0;i<n;i++) {
        	arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        bt(0);
        System.out.println(sb);
        
    }
    public static void bt(int num) {
    	if(num == m) {
    		for(int i=0;i<m;i++) {
    			sb.append(res[i]).append(" ");
    		}
    		sb.append("\n");
    		return;
    	}
    	
    	int ch = 0;
    	
    	for(int i=0;i<n;i++) {
    		if(!check[i] && arr[i] != ch) {
    			res[num] = arr[i];
    			ch = res[num];
    			check[i] = true;
    			bt(num + 1);
    			check[i] = false;
    		}
    	}
    	
    	
    }
    
    
}