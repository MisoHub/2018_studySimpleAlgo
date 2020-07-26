package q42842.carpet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = 
//			{10,2};
//			{8,1};
			{24,24};
		int[] result = Main.solution(input[0],input[1]);
		
		if(result != null)
			System.out.println(result[0]+","+result[1]);
	}
    
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow ;
        int root = (int)Math.sqrt(sum);
        
        for(int i=1; i<=root;i++) {
        	if(yellow%i==0 && 
        			(i+2)*(yellow/i+2)-yellow == brown){
        		if(yellow/i>i) {
        			answer[0]=yellow/i+2;
        			answer[1]=i+2;
        		}else {
        			answer[0]=i+2;
        			answer[1]=yellow/i+2;
        		}
        		return answer;
        	}
        }
        return null;
    }
    
    
	
	
	
}
