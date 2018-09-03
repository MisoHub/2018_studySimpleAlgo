package q12933.decendNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public long solution1(long n) {

		String s = Long.toString(n);
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return Long.parseLong(new StringBuilder(new String(arr)).reverse().toString());
	}

	public long solution2(long n) {

		char[] arr = Long.toString(n).toCharArray();
		char[] result = new char[arr.length];
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[arr.length - i - 1];
		}

		return Long.parseLong(new String(result));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		System.out.println(main.solution2(118372));
	}

}

/**solution1
 * 테스트 1 〉	통과 (1.34ms, 45.8MB)
테스트 2 〉	통과 (1.27ms, 45.9MB)
테스트 3 〉	통과 (1.29ms, 46.1MB)
테스트 4 〉	통과 (4.34ms, 45.8MB)
테스트 5 〉	통과 (1.33ms, 48.3MB)
테스트 6 〉	통과 (1.43ms, 45.7MB)
테스트 7 〉	통과 (1.32ms, 45.6MB)
테스트 8 〉	통과 (1.33ms, 48.7MB)
테스트 9 〉	통과 (1.30ms, 46.1MB)
테스트 10 〉	통과 (1.41ms, 48.6MB)
테스트 11 〉	통과 (1.30ms, 45.7MB)
테스트 12 〉	통과 (1.35ms, 48.9MB)
테스트 13 〉	통과 (1.32ms, 48.8MB)
테스트 14 〉	통과 (1.40ms, 48.3MB)
테스트 15 〉	통과 (1.45ms, 46.1MB)
테스트 16 〉	통과 (1.31ms, 45.6MB)
 */

/*
 * solution 2 
 * 
 * 테스트 1 〉	통과 (1.29ms, 46.1MB)
테스트 2 〉	통과 (1.29ms, 46.2MB)
테스트 3 〉	통과 (1.23ms, 46.3MB)
테스트 4 〉	통과 (1.40ms, 45.6MB)
테스트 5 〉	통과 (1.35ms, 45.7MB)
테스트 6 〉	통과 (1.33ms, 46MB)
테스트 7 〉	통과 (1.10ms, 48.5MB)
테스트 8 〉	통과 (1.24ms, 45.4MB)
테스트 9 〉	통과 (1.22ms, 46.1MB)
테스트 10 〉	통과 (1.37ms, 47.8MB)
테스트 11 〉	통과 (1.29ms, 51.1MB)
테스트 12 〉	통과 (1.26ms, 48.3MB)
테스트 13 〉	통과 (1.21ms, 49.8MB)
테스트 14 〉	통과 (1.27ms, 50MB)
테스트 15 〉	통과 (1.35ms, 45.8MB)
테스트 16 〉	통과 (1.32ms, 46MB)
 */

