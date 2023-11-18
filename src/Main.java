
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
	
		String s = in.next();
		
		int cnt = 0;
		int idx = 0;
		for(int i=idx;i<s.length();i++) {
			if(s.charAt(i) == 'K') {
				cnt++;
				idx = i;
				break;
			}
		}
		for(int i=idx;i<s.length();i++) {
			if(s.charAt(i) == 'O') {
				cnt++;
				idx = i;
				break;
			}
		}
		for(int i=idx;i<s.length();i++) {
			if(s.charAt(i) == 'R') {
				cnt++;
				idx = i;
				break;
			}
		}
		for(int i=idx;i<s.length();i++) {
			if(s.charAt(i) == 'E') {
				cnt++;
				idx = i;
				break;
			}
		}
		for(int i=idx;i<s.length();i++) {
			if(s.charAt(i) == 'A') {
				cnt++;
				idx = i;
				break;
			}
		}
		System.out.println(cnt);
	}
	
}

