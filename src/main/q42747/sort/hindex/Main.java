package q42747.sort.hindex;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] citations = 
//			{ 0, 1, 1, 1, 1, 3, 3 }; // 2
			{5};
		// {3,3,3};
		// { 0, 10000};
//		 { 0, 0};
//			{3,3,3,3,4};
//			{5,5,5,5,5};
//		 {0, 1, 99, 100, 101};
//		 {3, 0, 6, 1, 5};
		System.out.println(Main.solution(citations));
	}

	public static int solution(int[] citations) {
		int answer = 0;

		// sort
		Arrays.sort(citations);

		// find start index
		int startNum = 0;
		int endNum = citations[citations.length-1];
		for (int i = citations.length - 1; i >= 0; i--) {
			if (citations[i] > citations.length - i) {
				endNum = citations[i];
				continue;
			} else if (citations[i] <= citations.length - i) {
				startNum = citations[i];
				break;
			}
		}

		answer = startNum;

		int cntLess = 0;
		int cntMore = 0;

		for (int i = startNum; i <= citations.length && i < endNum; i++) {

			cntLess = 0;
			cntMore = 0;

			for (int j : citations) {
				if (j <= i)
					cntLess++;
				if (i <= j)
					cntMore++;
			}

			if (cntMore >= i) {
				if (cntLess <= i || i == 0) {
					answer = i;
				}
			}
		}
		return answer;
	}

}
// H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다.
// 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
// 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이
// 과학자의 H-Index입니다.
// 어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return
// 하도록 solution 함수를 작성해주세요.


// 특수한 공식이 있는 경우는 그냥 그것을 검색 후 구현하자.. 
//
//public int solution(int[] citations) {
//    Arrays.sort(citations);
//
//    int max = 0;
//    for(int i = citations.length-1; i > -1; i--){
//        int min = (int)Math.min(citations[i], citations.length - i);
//        if(max < min) max = min;
//    }
//
//    return max;
//}