package q42629.ramenFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;     
        int day=0;
        
        // init queue 
        Queue<HashMap> dateQueue = new LinkedList<HashMap>();
        for(int i=0; i< dates.length;i++) {
        	dateQueue.add(new HashMap(dates[i],supplies[i]));
        }
        
        
        // run factory 
        while(true) {
        	// check supply
        	stock-=1;
        	
        	// should be supplied
        	if(stock<0) {
        		// find & add biggest supply
        		int max = dateQueue.peek().
        		
        		for(int i : dateQueue) {
        			
        		}
        	}
        	
        	if(day==dates[it]) {
        		stock+=supplies[it];
        		it+=1;
        		answer+=1;
        	}
        	
        	// check stock 
        	if(stock>=k-1)
        		break;
        	
        	
        	// increase day + decrease k 
        	day+=1;
        	k-=1;
        }
        
        return answer;
    }
    

}

