
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		char[][] arr = new char[15][15];
		
		for(int i=0;i<15;i++) {
			String s = in.nextLine();
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j) != ' ') {
					//System.out.print(s.charAt(j));
					arr[i][(j+1)/2] = s.charAt(j); 
				}
			}
		}
		
		
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				if(arr[i][j] == 'w') {
					System.out.println("chunbae");
					System.exit(0);
				}else if(arr[i][j] == 'b') {
					System.out.println("nabi");
					System.exit(0);
				}else if(arr[i][j] == 'g') {
					System.out.println("yeongcheol");
					System.exit(0);
				}
			}
		}
	}
	
}

