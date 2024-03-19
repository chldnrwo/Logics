import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		String[][] arr = new String[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				String s = in.next();
				arr[i][j] = s;
			}
		}
		
		boolean check = false;
		
		for(int i=0;i<10;i++) {
			String ruler = arr[i][0]; 
			for(int j=1;j<10;j++) {
				if(!arr[i][j].equals(ruler)) {
					break;
				}
				check = true;
			}
		}
		
		for(int i=0;i<10;i++) {
			String ruler = arr[0][i]; 
			for(int j=1;j<10;j++) {
				if(!arr[j][i].equals(ruler)) {
					break;
				}
				check = true;
			}
		}
		
		
		if(check) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
}


