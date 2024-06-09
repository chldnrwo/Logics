package Baekjoon.Main;
import java.util.Scanner;

class BOJ1003{
	static int zero, one;
	static Integer[] arrZ ,arrO;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); 
		arrZ = new Integer[41];
		arrO = new Integer[41];
		
		arrZ[0] = 1;
		arrZ[1] = 0;
		arrO[0] = 0;
		arrO[1] = 1;
		
		int t = in.nextInt();
		for(int i=0;i<t;i++) {
			int n = in.nextInt();
			
			fibo1(n);
			fibo2(n);
			sb.append(arrZ[n]+" "+arrO[n]).append("\n");
		}
		System.out.println(sb);
	
	}
	public static int fibonacci(int n) {
	    if (n == 0) {
	        //System.out.print("0");
	    	zero++;
	        return 0;
	    } else if (n == 1) {
	        //System.out.print("1");
	        one++;
	    	return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	public static int fibo1(int n) {
		if(arrZ[n]==null) {
			arrZ[n] = fibo1(n-1) + fibo1(n-2); 
		}
		
		return arrZ[n];
	}
	public static int fibo2(int n) {
		if(arrO[n]==null) {
			arrO[n] = fibo2(n-1) + fibo2(n-2); 
		}
		
		return arrO[n];
	}
}