import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int a = in.nextInt();
    	int b = in.nextInt();
    	
    	int ching = 1;
    	int binan = 1;
    	for(int i=0;i<n;i++){
    		ching+=a;
    		binan+=b;
    		if(ching < binan) {
    			int tmp = 0;
    			tmp = ching;
    			ching = binan;
    			binan = tmp;
    		}else if(ching == binan) {
    			binan--;
    		}

    	}
    	
    	System.out.println(ching+" "+binan);
    } 
   
    
}
//92 5