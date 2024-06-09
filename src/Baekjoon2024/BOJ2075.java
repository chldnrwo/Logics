package Baekjoon2024;
import java.util.*;
import java.io.*;
 

 
class BOJ2075 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n*n];
        int idx =0;
 
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }
 
        Arrays.sort(arr);
 
        System.out.println(arr[n*n - n]);
    }
}