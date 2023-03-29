import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = in.nextInt();
		int a = 0;
		int cnt = 2;
		while(a != n) {
			cnt = cnt+cnt-1;
			a++;
		}
		System.out.println(cnt*cnt);
	}
}
/*
 * 2
 * 3
 * 5
 * 9
 * 17
 * 33
 */