import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<5;i++) {
			int n = in.nextInt();
			if(set.contains(n)) {
				set.remove(n);
			}else {
				set.add(n);
			}
		}
		System.out.println(set.toString().charAt(1));
	}	
}
