package Baekjoon.Main;
import java.util.Scanner;

class BOJ1063{
	static String king,stone;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		king = in.next();
		stone = in.next();
		int t = in.nextInt();

		for(int i=0;i<t;i++) {
			String m = in.next();
			
			move(m);
		}
		
		System.out.println(king);
		System.out.println(stone);
	}
	public static void move(String s) {
		char xk = king.charAt(0);
		char xs = stone.charAt(0);
		
		int yk = king.charAt(1)-48;
		int ys = stone.charAt(1)-48;
		
		if(s.equals("R")) {
			xk++;
		}else if(s.equals("L")) {
			xk--;
		}else if(s.equals("B")) {
			yk--;
		}else if(s.equals("T")) {
			yk++;
		}else if(s.equals("RT")) {
			xk++;
			yk++;
		}else if(s.equals("LT")) {
			xk--;
			yk++;
		}else if(s.equals("RB")) {
			xk++;
			yk--;
		}else if(s.equals("LB")) {
			xk--;
			yk--;
		}
		
		//System.out.println(xk+" "+yk+" "+xs+" "+ys);
		
		if(xk==xs && yk==ys) {
			if(s.equals("R")) {
				xs++;
			}else if(s.equals("L")) {
				xs--;
			}else if(s.equals("B")) {
				ys--;
			}else if(s.equals("T")) {
				ys++;
			}else if(s.equals("RT")) {
				xs++;
				ys++;
			}else if(s.equals("LT")) {
				xs--;
				ys++;
			}else if(s.equals("RB")) {
				xs++;
				ys--;
			}else if(s.equals("LB")) {
				xs--;
				ys--;
			}
		}
		
		//System.out.println(xk+" "+yk+" "+xs+" "+ys);
		
		if('A'<=xk && xk<= 'H' &&
			1<=yk && yk<=8 &&
			'A'<=xs && xs<= 'H' &&
			1<=ys && ys<=8
				) {
			//System.out.println(xk+" "+yk+" "+xs+" "+ys);
			king = String.valueOf(xk)+Integer.toString(yk);
			stone = String.valueOf(xs)+Integer.toString(ys);
		}
		
		
	}
}

//킹이 돌이 잇는곳을 가면 같은 방향으로 돌 이동