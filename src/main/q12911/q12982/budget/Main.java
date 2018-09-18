package q12982.budget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	 static public int solution(int[] d, int budget) {
	      int answer = 0;
//	     ArrayList<Integer> arrlist = new ArrayList(Arrays.asList(d));
	     Arrays.sort(d); 
	     
	     for(int v : d) {
	    	 budget = budget - v;
	    	 answer = answer + 1; 
	    	 
	    	 if(budget<0) {
	    		 answer = answer -1;
	    		 break;
	    	 }
	     }
	      return answer;
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
