package skillcheck.q136873.progresses;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] progresses = {93, 30, 55};
		int[] speeds =  {1,30,5};
		
		int[] result = Main.solution(progresses, speeds);
		for(int i: result)
			System.out.print(i+", ");
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int nDeploy = 0;

		while (nDeploy < progresses.length) {
			int nFinished = 0;

			// add speeds
			for (int i = nDeploy; i < progresses.length; i++) {
				progresses[i]+=speeds[i];
			}
			
			// check finished
			for (int i = nDeploy; i < progresses.length; i++) {
				if (progresses[i] >= 100) {
					nFinished += 1;
					continue;
				}else
					break;
			}
			
			if (nFinished > 0) {
				answer.add(nFinished);
				nDeploy += nFinished;
			}

		}

		return answer.stream().mapToInt(i->i).toArray();
	}

}
