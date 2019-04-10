package q42883.makeBiggerNum;

import java.util.Arrays;

public class Solution {

	static public void main(String[] args) {

		Solution s = new Solution();

		System.out.println(s.solution("1924", 2));
		System.out.println(s.solution("1231234", 3));
		System.out.println(s.solution("4177252841", 4));
		System.out.println(s.solution("5432154321", 8));
	}

	public String solution(String number, int k) {
		String answer = "";
		// 채워야 되는 수
		int fn = number.length() - k;

		StringBuffer result = new StringBuffer();

		for (int i = 0; fn > 0; i++) {
			boolean isBig = true;
			for (int j = i + 1; fn != 0 && j <= number.length() - fn; j++) {

				// 그 뒤의 수 중에 큰 값이 있으면 PASS
				if (number.charAt(i) < number.charAt(j)) {
					isBig = false;
					break;
				}
			}
			if (isBig) {
				result.append(number.charAt(i));
				fn--;
			}
		}
		answer = result.toString();
		return answer;
	}

	public String solution2(String number, int k) {
		String answer = "";

		// 앞자리 수 설정
		char[] head = number.substring(0, k + 1).toCharArray();
		Arrays.sort(head);

		int iHead = number.indexOf(head[k]);
		int delNum = iHead;

		// 숫자 사전 생성
		StringBuffer sb = new StringBuffer(number.substring(iHead, number.length()));

		for (int i = 0; i < sb.length(); i++) {
			if (delNum >= k)
				break;

			if (i == sb.length() - 1 || sb.charAt(i) < sb.charAt(i + 1)) {
				sb.deleteCharAt(i);
				delNum++;
				i--;
			}
		}

		if (sb.length() > number.length() - k)
			answer = sb.substring(0, number.length() - k);
		else
			answer = sb.toString();

		return answer;
	}

}
