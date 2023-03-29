package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ1015{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N=in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=in.nextInt();
		}
		
		int[] arrB = arr.clone();
		Arrays.sort(arrB);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arrB));
		
		Integer[] arrR = new Integer[N];
		for(int i=0;i<N;i++){
			int a = arrB[i];
			for(int j=0;j<N;j++) {
				if(a==arr[j]) {
					if(arrR[j]==null) {
						arrR[j]=i;	
						break;
					}
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.print(arrR[i]+" ");
		}
		
	}
}