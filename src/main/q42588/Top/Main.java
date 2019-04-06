package q42588.Top;

public class Main {

	static public int[] solution(int[] heights) {

		int[] answer = new int[heights.length];

		// init
		for (int v : answer) {
			v = 0;
		}

		for (int i = 1; i < heights.length; i++) {
			for (int j = 0; j < i; j++) {
				if (heights[i] < heights[j]) {
					answer[i] = j+1;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = { 6, 9, 5, 7, 4 };
		int[] input2 = {3,9,9,3,5,7,2};
		
		for(int v: solution(input1)) {
			System.out.print(v);
			System.out.print(" ");
		}
		System.out.println();
	}

}
