package skillcheck.q136873.diagonal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Main.solution(1, 1));
	}

	public static long solution(int w, int h) {
		long answer = 0;

		// find gcd
		int bN, sN;
		int gcd;
		if (w >= h) {
			bN = w;
			sN = h;
		} else {
			bN = h;
			sN = w;
		}

		while (sN != 0) {
			int r = bN % sN;
			bN = sN;
			sN = r;
		}
		gcd = bN;

		int wg = w / gcd;
		int hg = h / gcd;

		answer = (long)w * (long)h - (long)((wg+hg-1) * gcd);

		return answer;
	}
}
