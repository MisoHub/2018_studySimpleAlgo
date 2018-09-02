package q12934.rootNumber;

public class Main {

	static public long solution(long n) {
		for (long i = 1; n >= i * i; i++) {
			if (i * i == n)
				return n + 2 * i + 1L;
		}
		return -1L;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(50000000000000L));
	}

}
