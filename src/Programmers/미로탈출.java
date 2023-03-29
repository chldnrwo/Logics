package Programmers;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class 미로탈출 {
	static char[][] arr;
	static Integer[][] visit;
	static int[] mx = {-1, 0, 1, 0}; 
	static int[] my = {0, -1, 0, 1}; 
	static int garo,sero;
    public static int solution(String[] maps) {
        int answer = 0;
   
        garo = maps.length;
        sero = maps[0].length();
        Pair st=null;
        Pair lb=null;
        Pair ex=null;
        arr = new char[garo][sero];
        visit = new Integer[garo][sero];
        
        for(int i=0;i<garo;i++){
        	String s = maps[i];
        	for(int j=0;j<sero;j++) {
        		arr[i][j] = s.charAt(j);
        		if(arr[i][j]=='S') {
        			st = new Pair(i, j);
        		}else if(arr[i][j]=='L') {
        			lb = new Pair(i, j);
        		}else if(arr[i][j]=='E') {
        			ex = new Pair(i, j);
        		}
        	}
        }
        
        if(!bfs(st, lb)) {
        	return -1;
        }
        int a = visit[lb.x][lb.y];
        visit = new Integer[garo][sero];
        if(!bfs(lb, ex)) {
        	return -1;
        }
        int b =  visit[ex.x][ex.y];
        
        
//        for(int i=0;i<garo;i++) {
//        	for(int j=0;j<sero;j++) {
//            	System.out.print(visit[i][j]+" ");
//            }
//        	System.out.println();
//        }
        
        answer = a + b;
        //System.out.println(answer);
        return answer;
    }
    public static boolean bfs(Pair str, Pair end) {
    	
    	Deque<Pair> q = new LinkedList<>();
    	visit[str.x][str.y] = 0;
    	q.offer(str);
    	
    	while(!q.isEmpty()) {
    		
    		Pair next = q.poll();
    		int x = next.x; 
    		int y = next.y;
    		if(x == end.x && y == end.y) {
    			return true;
    		}
    		
    		
    		for(int i=0;i<4;i++) {
    			int nx = x + mx[i];
    			int ny = y + my[i];
    			
    			if(0<=nx && nx<garo &&
    					0<=ny && ny<sero && arr[nx][ny] != 'X') {
    				if(visit[nx][ny]==null) {
    					
    					visit[nx][ny]=visit[x][y]+1;
    					q.offer(new Pair(nx, ny));
    				}
    			}
    		}
    	}
    	return false;
    
    }
    static class Pair{
    	private int x;
    	private int y;
    	
    	Pair(int x, int y){
    		this.x = x;
    		this.y = y;
    	}
    }
    
    public static void main(String[] args) {
    	String[] maps = {"LOOXS", "OOOOX", "OOOOO", "OOOOO", "EOOOO"};
    	solution(maps);
	}
}
//시작에서 레버
//레버에서 탈출