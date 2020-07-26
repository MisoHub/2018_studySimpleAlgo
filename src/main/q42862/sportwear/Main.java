package q42862.sportwear;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int[] lost = 
			{2,4};
		int[] reserve = 
			{3};
		
		System.out.println(Main.solution(n, lost, reserve));
	}

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] swMap = new int[n];

        //init 
        for(int i=0; i<n;i++) {swMap[i]=1;}
        for(int i : lost) {swMap[i-1] -= 1;}
        for(int i : reserve) {swMap[i-1] +=1;}
        
        // scan 
        for(int i=0; i<n;i++) {
        	if(swMap[i]==0) {
        		if(i>0 && swMap[i-1]==2) {
        			swMap[i]=1;
        			swMap[i-1]=1;
        		}else if (i<n-1 && swMap[i+1]==2) {
        			swMap[i]=1;
        			swMap[i+1]=1;
        		}
        	}
        }
        
        for(int i : swMap) {
        	if(i>0)
        		answer++;
        }
        
        return answer;
    }
    
}
