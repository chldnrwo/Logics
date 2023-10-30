
import java.util.*;

public class Main{
	static Integer[] arr;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String s = in.next();
		
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			//System.out.println(s.substring(i));
			//System.out.println(s.substring(0, n-i));
			//System.out.println();
			if(s.substring(n-i).equals(s.substring(0, i))) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
}

