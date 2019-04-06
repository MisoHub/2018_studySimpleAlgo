package kakao2017.knewsClustering;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Main {

	public int solution(String str1, String str2) {
		int answer = 0;
		final int MNUM = 65536;

		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		TreeMap<String, Integer> map2 = new TreeMap<String, Integer>();

		// get sub set of str1
		getSubSet(str1, map1);
		getSubSet(str2, map2);

		// get sub set of str2
		HashSet<String> set1 = new HashSet(map1.keySet());
		HashSet<String> set2 = new HashSet(map2.keySet());

		// get retain count
		set1.retainAll(set2);
		Iterator<String> it = set1.iterator();
		double retainCnt = 0;

		// get duplicate key cnt (min-dup)
		while (it.hasNext()) {
			String key = it.next();
			retainCnt += Math.min(map1.get(key), map2.get(key));
		}

		set1 = new HashSet(map1.keySet());
		set1.addAll(set2);
		it = set1.iterator();

		double unionCnt = 0;

		// get duplicate key cnt (max-dup)
		while (it.hasNext()) {
			String key = it.next();
			if (map1.containsKey(key) && map2.containsKey(key))
				unionCnt += Math.max(map1.get(key), map2.get(key));
			else if (map1.containsKey(key)) {
				unionCnt += map1.get(key);
			} else {
				unionCnt += map2.get(key);
			}
		}

		if (retainCnt == 0)
			return MNUM;
		else
			return (int) (retainCnt / unionCnt * MNUM);
	}

	public void getSubSet(String str, TreeMap<String, Integer> map) {
		// parse to lowercase
		str = str.toLowerCase();

		for (int i = 0; i < str.length() - 1; i++) {
			String key = str.substring(i, i + 2);

			// check key value
			if (key.charAt(0) < 'a' || key.charAt(0) > 'z' || key.charAt(1) < 'a' || key.charAt(1) > 'z') {
				// skip the key
				continue;

			}

			// put map values (key+cnt, cnt)
			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		System.out.println(main.solution("FRANCE", "french"));
		System.out.println(main.solution("handshake", "shake hands"));
		System.out.println(main.solution("aa1+aa2", "AAAA12"));
		System.out.println(main.solution("E=M*C^2", "e=m*c^2"));
		System.out.println(main.solution("skateboard", "skate board"));

	}

}
