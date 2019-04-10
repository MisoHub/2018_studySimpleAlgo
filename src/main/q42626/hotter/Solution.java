package q42626.hotter;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();

		System.out.println(s.solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7));

	}

	public int solution(int[] scoville, int K) {
		int answer = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i : scoville)
			list.add(i);

		Collections.sort(list);

		while (true) {

			// 값 확인 
			if (list.get(0) >= K) {
				break;
			}else if(list.size()<2) {
				return -1;
			}

			list.set(0, list.get(0) + list.get(1) * 2);
			list.remove(1);
			
			// 삽입 정렬 
			for(int i=1;i<list.size();i++) {
				
				if(list.get(0)<list.get(i)) {
					int tmp = list.get(0);
					list.add(i, tmp);
					list.remove(0);
				}else {
					if(i==list.size()-1) {
						int tmp = list.get(0);
						list.add(i, tmp);
						list.remove(0);
					}
				}
			}
			
			answer++;
		}
		return answer;
	}

}
