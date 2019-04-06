package q42883.makeBiggerNum;

import java.util.Arrays;

public class Solution {

	static public void main(String[] args) {

		Solution s = new Solution();

		 System.out.println(s.solution("1924", 1));
		 System.out.println(s.solution("1231234", 1));
		System.out.println(s.solution("4177252841", 2));
	}

	public String solution(String number, int k) {
		String answer = "";

		// 앞자리 수 설정 
		char[] head = number.substring(0, k + 1).toCharArray();
		Arrays.sort(head);

		int iHead = number.indexOf(head[k]);
		int delNum = iHead;

		// 숫자 사전 생성
		char[] sorted = number.substring(iHead,number.length()).toCharArray();
		Arrays.sort(sorted);

		StringBuffer dic = new StringBuffer();
		for (char c : sorted)
			dic.append(c);

		String sub = dic.substring(0, k-delNum);
		StringBuffer sb = new StringBuffer();
		for (char c : number.substring(iHead,number.length()).toCharArray()) {
			if (sub.contains(c + "") && delNum < k) {
				delNum++;
				continue;
			}
			sb.append(c);
		}

		answer = sb.toString();
		return answer;
	}

}
