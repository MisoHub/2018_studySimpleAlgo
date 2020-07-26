package q42586.stack.queue.funcdev;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		for(int i : Solution.solution(progresses, speeds)) {
			System.out.print(" "+i+", ");
		}

	}
	
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int deployed = 0;
		while (deployed < progresses.length) {
			int finished = 0;
			boolean isSucceed = true;
			
			for (int i = deployed; i < progresses.length; i++) {
				progresses[i] = progresses[i] + speeds[i];
				if (isSucceed && progresses[i] >= 100) {
					finished += 1;
				} else {
					isSucceed = false;
				}
			}
			if(finished>0) {
				result.add(finished);
				deployed+=finished;
			}
		}
        return result.stream().mapToInt(i->i).toArray();
    }
}
