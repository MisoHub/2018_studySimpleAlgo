package main.q12899.nation124;

/*
문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법	124 나라	10진법	124 나라
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 500,000,000이하의 자연수 입니다.
입출력 예
n	result
1	1
2	2
3	4
4	11

*/
public class Nation124 {

	public String solution(int n) {
		StringBuilder sb = new StringBuilder();

		for (int nRoot = 3; n != 0; nRoot *= 3) {
			if (n % nRoot / (nRoot / 3) == 0) {
				sb.append(4);
				n = n - nRoot;
			} else {
				sb.append(n % nRoot / (nRoot / 3));
				n = n - ((n % nRoot / (nRoot / 3)) * nRoot / 3);
			}
		}

		return sb.reverse().toString();
	}

	public String solution1(int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; n != 0; i++) {

			int k = n % 3;
			n = n / 3;
			
			if (k == 0) {
				n -= 1;
				k = 4;
			}
			
			sb.append(k);
		}

		return sb.reverse().toString();
	}

	public static void main(String args[]) {
		Nation124 n124 = new Nation124();
		System.out.println(n124.solution(4));
	}
	// 코드의 간결성은 solution1이 더 나으나, 성능상의 차이는 없음. 
	// StringBuffer를 사용하는 이유는 기존 String의 + 연산시 메모리 할당 작업이 추가로 이루어 짐으로 성능에 취약하다. 
	// 코드 작성 시에 편한 방식대로 하면될듯. solution은 범용적인 n진수 연산을 변경한 것이고, solution1은 문제에 최적화된 답안.  
}
