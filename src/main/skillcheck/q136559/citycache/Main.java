package skillcheck.q136559.citycache;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cacheSize = 0;
		String[] cities = { "Jeju", "Jeju" };

		System.out.println(solution(cacheSize, cities));
	}

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		LinkedList<String> cache = new LinkedList<String>();

		for (String s : cities) {
			boolean isHit = false;

			// check cache
			for (int i = 0; i < cache.size(); i++) {
				if (cache.get(i).contentEquals(s.toLowerCase())) {
					// cache hit
					cache.remove(i);
					cache.addFirst(s.toLowerCase());
					isHit = true;
					answer += 1;
					break;
				}
			}

			// cache miss
			if (!isHit) {
				if (cache.size() != 0 && cacheSize <= cache.size())
					cache.removeLast();
				if(cacheSize-cache.size()>0) {
					cache.addFirst(s.toLowerCase());
				}
				answer += 5;
			}
		}
		return answer;
	}
}
