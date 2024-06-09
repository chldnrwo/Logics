package Programmers;

import java.util.Arrays;

public class 혼자서하는틱택토 {
	static int[] checkOX = new int[2];
	public static int solution(String[] board) {
		int answer = -1;
		char[][] arr = new char[3][3];
        
        int checkO = 0;
        int checkX = 0;
        for(int i=0;i<3;i++) {
        	String s = board[i]; 
        	for(int j=0;j<3;j++) {
        		arr[i][j] = s.charAt(j);
        		if(arr[i][j] == 'O') {
        			checkO++;
        		}else if(arr[i][j] == 'X') {
        			checkX++;
        		}
        	}
        }
		
        if(checkO < checkX || checkO-checkX>=2) {
        	answer = 0;
        	System.out.println(answer);
        	return answer;
        }
        end(board);
        if(checkOX[0]==1 && checkOX[1]==1) {
        	answer = 0;
        	System.out.println(answer);
        	return answer;
        }
        
        if(checkOX[0]==1 && checkOX[1]==0) {
        	if(checkO == checkX) {
        		answer = 0;
        		System.out.println(answer);
        		return answer;
        	}
        }else if(checkOX[0]==0 && checkOX[1]==1) {
        	if(checkO - checkX == 1) {
        		answer = 0;
        		System.out.println(answer);
        		return answer;
        	}
        }
        
        answer = 1;
        System.out.println(answer);
        return answer;
    }
	public static void end(String[] board) {
		for(int i=0;i<board.length;i++) {
			if(board[i].equals("OOO")) {
				checkOX[0] = 1;
			}
			if(board[i].equals("XXX")) {
				checkOX[1] = 1;
			}
		}
		for(int i=0;i<3;i++) {
			char a = board[0].charAt(i);
			char b = board[1].charAt(i);
			char c = board[2].charAt(i);
			
			if( a!='.' &&(a==b && b==c)) {
				if(a=='O') {
					checkOX[0] = 1;
				}
				if(a=='X'){
					checkOX[1] = 1;
				}
			}
		}
		
		char c1 = board[0].charAt(0);
		char c2 = board[1].charAt(1);
		char c3 = board[2].charAt(2);
		if( c1!='.' &&(c1==c2 && c2==c3)) {
			if(c1=='O') {
				checkOX[0] = 1;
			}
			if(c1=='X'){
				checkOX[1] = 1;
			}
		}
		
		char d1 = board[0].charAt(2);
		char d2 = board[1].charAt(1);
		char d3 = board[2].charAt(0);
		if( d1!='.' &&(d1==d2 && d2==d3)) {
			if(d1=='O') {
				checkOX[0] = 1;
			}
			if(d1=='X'){
				checkOX[1] = 1;
			}
		}		
	}
	
	
	public static void main(String[] args) {
		String[] board = {"XOX", "XOO", "XO."};
		solution(board);
	}
}
// X가 선공 규칙을 어긴경우
// 누군가 승리한 경우
// 속도문제는 아니고 예외상황 하나를 못 본 경우
