package q12913.DownToLand;

public class Main {
	  int solution(int[][] land) {
	        int answer = 0;
	        
	        // calculate sub value of max - second 
	        int[] subs = new int[land.length];
	        for(int i=0;i<land.length;i++){
	            // get max value 
	            int max = land[i][0];
	            int sub = land[i][0];
	            
	            
	            
	            // get subs 
	            subs[i] = max-sub ;
	        }
	        
	        
	        return answer;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
