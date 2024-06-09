package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31432 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		
		
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
			
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==0 && arr.length == 1){
					System.out.println("YES");
					System.out.println(0);
					System.exit(0);
			}
			if(arr[i]!=0){
				System.out.println("YES");
				System.out.println(arr[i]*111);
				System.exit(0);
			}
		}
		
		
		
		
	}
}