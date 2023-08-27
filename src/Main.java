import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = n/300;
		n %= 300;
		b = n/60;
		n %= 60;
		c = n/10;
		n %= 10;
		
		if(n==0) {
			System.out.println(a+" "+b+" "+c);
		}else {
			System.out.println(-1);
		}
	}
}
