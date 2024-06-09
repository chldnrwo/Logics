package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31628 {
	static String[][] arr;
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		arr = new String[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				String s = in.next();
				arr[i][j] = s;
			}
		}
		
		boolean check = false;
		
		for(int i=0;i<10;i++) {
			if(check(i)) {
				System.out.println(1);
				System.exit(0);
			}
		}
		
		for(int i=0;i<10;i++) {
			if(check2(i)) {
				System.out.println(1);
				System.exit(0);
			}
		}
		
		System.out.println(0);

	}
	public static boolean check(int a) {
		String ruler = arr[a][0]; 
		for (int i = 1; i < 10; i++) {
	       if(!arr[a][i].equals(ruler)) {
	    	   return false;
	       }
	    }
	    return true;
	}
	public static boolean check2(int a) {
		String ruler = arr[0][a]; 
		for (int i = 1; i < 10; i++) {
	       if(!arr[i][a].equals(ruler)) {
	    	   return false;
	       }
	    }
	    return true;
	}
}


