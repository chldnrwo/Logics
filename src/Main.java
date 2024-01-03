
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		char[] arr = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			char b;
			if((65<=a && a<=90) || (97<=a && a<=122)  ) {
				if(91<=(a+13) && (a+13)<97) {
					
				}
				
				b = (char)(a+13);
			}else {
				b = a;
			}
			
			arr[i] = b;
		}
		
		for(int i=0;i<s.length();i++) {
			System.out.print(arr[i]);
		}
	}
}

