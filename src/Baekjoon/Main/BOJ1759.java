package Baekjoon.Main;
import java.util.Arrays;
import java.util.Scanner;

class BOJ1759{
	static String[] arr;
	static String[] pwd;
	static int L,C;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		L = in.nextInt();
		C = in.nextInt();
		
		arr = new String[C];
		
		pwd = new String[L];
		
		for(int i=0;i<C;i++) {
			String a = in.next();
			arr[i] = a;
		}
		Arrays.sort(arr);
		BT(0, 0);
		
	}
	
	public static void BT(int depth, int start) {
		
		if(depth==L) {
			if(check()) {
				for(String a : pwd) {
					System.out.print(a);
				}
				System.out.println();
			}
			return;
		}

		
		for(int i=start;i<C;i++) {
			pwd[depth] = arr[i];
			BT(depth+1, i+1);
		}

	}
	public static boolean check() {
		int j = 0;
		int m = 0;
		for(int i = 0 ;i<L;i++) {
			String s = pwd[i];
			if(s.equals("a") || s.equals("e") || s.equals("i") 
				|| s.equals("o") || s.equals("u")) {
				m++;
			}else {
				j++;
			}
		}
		
		if(m<1 || j<2) {
			return false;
		}
		return true;
	}

}