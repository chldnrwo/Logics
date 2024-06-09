package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ7662 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
        	int k = Integer.parseInt(br.readLine());
        	Map<Integer, Integer> map = new HashMap<>();
        	PriorityQueue<Integer> minQ = new PriorityQueue<>();
        	PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        	for(int j=0;j<k;j++) {
        		String[] input = br.readLine().split(" ");
                char c = input[0].charAt(0);
                int a = Integer.parseInt(input[1]);
        		
        		if(c == 'I') {
        			map.put(a, map.getOrDefault(a, 0) + 1);
        			
        			minQ.add(a);
        			maxQ.add(a);
        		} else {
        			if(map.size() == 0) {
        				continue;
        			}
        			PriorityQueue<Integer> q2 = a == 1? maxQ : minQ;
        			remove(q2, map);
        		}
        	}
        	
        	if(map.size()==0) {
        		System.out.println("EMPTY");
        	}else {
        		int a = remove(maxQ, map);
        		System.out.println(a + " " + (map.size() > 0 ? remove(minQ, map) : a));
        	}
        }
    }
    public static int remove(PriorityQueue<Integer> q2, Map<Integer, Integer> map) {
    	int num;
    	while(true) {
    		num = q2.poll();
    		int cnt = map.getOrDefault(num, 0);
    		
    		if(cnt ==0 ) {
    			continue;
    		}
    		if(cnt == 1) {
    			map.remove(num);
    		} else {
    			map.put(num, cnt - 1);
    		}
    		break;
    	}
    	
    	return num;
    }
}
