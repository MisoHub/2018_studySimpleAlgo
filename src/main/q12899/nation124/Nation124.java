package q12899.nation124;

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
