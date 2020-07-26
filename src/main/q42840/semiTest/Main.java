package q42840.semiTest;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers =
				// {1,2,3,4,5};
				{ 1, 3, 2, 4, 2 };
		// {2, 1, 2, 3, 2, 4, 2, 5};
		int[] result = Main.solution(answers);
		for (int i : result)
			System.out.println(i);
	}

	public static int[] solution(int[] answers) {

		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] nCheck = new int[3];
		int[][] pattern = new int[3][];

		int[] p1 = { 1, 2, 3, 4, 5 };
		int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// init pattern
		for (int i = 0; i < nCheck.length; i++) {
			nCheck[i] = 0;
		}

		pattern[0] = p1;
		pattern[1] = p2;
		pattern[2] = p3;

		// check
		for (int j = 0; j < nCheck.length; j++) {
			for (int i = 0; i < answers.length; i++) {
				if (answers[i] == pattern[j][i % pattern[j].length]) {
					nCheck[j]++;
				}
			}
		}

		// add

		int maxValue = -1;
		for (int i : nCheck) {
			if (maxValue < i && i != 0) {
				maxValue = i;
			}
		}

		for (int i = 0; i < nCheck.length; i++) {
			if (maxValue == nCheck[i]) {
				answer.add(i + 1);
			}

		}

		return answer.stream().mapToInt(i -> i).toArray();
	}
}
