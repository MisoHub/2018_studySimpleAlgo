package q12943.collatz;

public class Main {

	static int cnt = 0;

	static public int solution(int num) {

		if (num == 1)
			return cnt;

		cnt = cnt + 1;

		if (cnt > 500)
			return -1;

		return (num % 2 == 1) ? solution(num * 3 + 1) : solution(num / 2);
	}

	static public void main(String[] args) {
		System.out.println(solution(6));
	}
}
