package Baekjoon.Main;
import java.util.Scanner;

class BOJ2485{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int[] arr = new int[t]; 
		for(int i=0;i<t;i++) {
			arr[i] = in.nextInt();
		}
		int[] arr2 = new int[t-1];
		for(int i=0;i<t-1;i++) {
			arr2[i] = arr[i+1] - arr[i];
		}
		int a = arr2[0];
		for(int i=1;i<arr2.length;i++) {
			a = eucd(a, arr2[i]);
		}
		
		int cnt=0;
		for(int i=0;i<arr2.length;i++) {
			int b = arr2[i]/a - 1; 
			cnt+=b;
		}
		System.out.println(cnt);
		
	}
	
	public static int eucd(int a,int b) {
		int r = a%b;
		if(r==0) {
			return b;
		}else {
			return eucd(b, r);
		}
	}
}