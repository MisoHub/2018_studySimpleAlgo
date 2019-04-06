package q12906.noDuplicateNum;

import java.util.Arrays;

public class Main {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		int cnt = 0;
		
		answer[cnt++] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				answer[cnt++] = arr[i];
			}
		}
		
		 return Arrays.copyOfRange(answer, 0, cnt);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
