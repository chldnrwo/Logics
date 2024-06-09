package Baekjoon.Main;
import java.util.*;

public class BOJ29731{

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		list.add("Never gonna give you up");
		list.add("Never gonna let you down");
		list.add("Never gonna run around and desert you");
		list.add("Never gonna make you cry");
		list.add("Never gonna say goodbye");
		list.add("Never gonna tell a lie and hurt you");
		list.add("Never gonna stop");
		
		int n=Integer.parseInt(in.nextLine());
		
		boolean check = true;
		
		for(int i=0;i<n;i++) {
			String s = in.nextLine();
			//System.out.println(s);
			if(!list.contains(s)) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
		
		
	}
	
}
