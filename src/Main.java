import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a<b) {
			System.out.println("Bus");
		}else if(a>b) {
			System.out.println("Subway");
		}else {
			System.out.println("Anything");
		}
	}
}