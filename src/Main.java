import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	
    	int a = in.nextInt();
    	int b = in.nextInt();
    	
		if((a + b) % 2 != 0 || a < b) {
			System.out.println(-1);
		}else {
			
			System.out.println(((a + b) / 2) + " " + (((a + b) / 2) - b));
		}
    	
    }

   
}