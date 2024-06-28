package Baekjoon2024;
import java.util.Scanner;

public class BOJ15232 {
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	
    	int a = in.nextInt();
    	int b = in.nextInt();
    	StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
    	System.out.println(sb);
    }

   
}