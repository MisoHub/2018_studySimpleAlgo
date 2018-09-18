package q12954.NumberGAP;

public class Main {
	
	static public long[] solution(int x, int n) {
		long[] answer = new long[n];

		answer[0] = x;
		
		for(int i=1; i<n ; i++) {
			answer[i] = answer[0]*(i+1);
		}
		
//		**** case 1 
//		for (int i = 1; i < answer.length; i++) {
//			answer[i] = answer[i - 1] + x;
//		}
//		return answer;
//		
//		
//		**** case 2			
		for(int i=1; i<n ; i++) {
			answer[i] = answer[0]*(i+1);
		}
		return answer;
//		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
