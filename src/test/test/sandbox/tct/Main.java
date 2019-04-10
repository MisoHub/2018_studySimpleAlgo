package test.sandbox.tct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {

	static public void main(String[] args) {

		Main m = new Main();
		m.quiz_2018_05();
	}

	void quiz2018_02() {
		String org_str = "we1re3hewo34ddre67com21rue";
		String bck_str = "1eare4hewor5dd8eamcome3rue";

		StringBuilder sb = new StringBuilder(org_str);
		for (int i = 0; i < org_str.length(); i++) {
			if (sb.charAt(i) <= '9' && sb.charAt(i) >= '0') {
				if (bck_str.charAt(i) > '9' || bck_str.charAt(i) < '0') {
					sb.setCharAt(i, bck_str.charAt(i));
				}
			}
		}

		System.out.println("1차복원 : " + sb.toString());

		String net_str = "wear ethe worl ddre amco metr ue";
		net_str = net_str.replaceAll("\\s+", "");
		System.out.println(net_str);

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) <= '9' && sb.charAt(i) >= '0') {
				if (net_str.charAt(i) > '9' || net_str.charAt(i) < '0') {
					sb.setCharAt(i, net_str.charAt(i));
				}
			}
		}

		System.out.println("2차복원 : " + sb.toString());
	}

	void quiz_2018_03() {
		// 악성코드
		String org = "abc.txt abce abcd.txt acde.txt bxyz.txt bcde axbz.txt abcxd.txt acxy.txt axzy.txt";
		String[] fileList = org.split("\\s+");

		ArrayList<String> al = new ArrayList<String>();

		for (String s : fileList) {
			al.add(s);
		}

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).indexOf('.') < 0) {
				al.remove(i);
				i--;
			}
		}

		System.out.println("1차 악성 제거 : " + al.toString());

		for (int i = 0; i < al.size(); i++) {

			int ai = al.get(i).indexOf('a');
			int xi = al.get(i).indexOf('x');

			if (ai >= 0 || xi >= 0) {
				if (ai >= 0 && al.get(i).indexOf('b') == ai + 1) {
					continue;
				} else if (xi >= 0 && al.get(i).indexOf('y') == xi + 1) {
					continue;
				} else if (ai >= 0 && xi >= 0 && ai == xi - 1) {
					continue;
				} else {
					al.remove(i);
					i--;
				}
			}
		}

		System.out.println("2차 악성 제거 : " + al.toString());

	}

	void quiz_2018_04() {
		int N = 5;
		// int[][] board= new int[][]{
		// {-1,0,7,9},
		// {-6,2,-3,5},
		// {3,-6,0,-5},
		// {7,8,-7,2}};
		//

		int[][] board = new int[][] { { 1, -3, 0, 2, 5 }, { -3, 0, 8, -3, 7 }, { 9, -1, -2, 6, 0 }, { -2, -5, 9, 7, 6 },
				{ 3, 2, 4, 7, -5 } };

		int count = 0;
		for (int i = 1; i <= N; i++) {
			count += Math.pow(i, 2);
		}

		System.out.println("만들 수 있는 도형 합 : " + count);

		int max = Integer.MIN_VALUE;
		// int size
		for (int i = N; i > 0; i--) {

			// setting root
			for (int j = 0; j <= N - i; j++) {
				for (int k = 0; k <= N - i; k++) {

					int inSum = 0;

					// cal sum
					for (int a = j; a < j + i; a++) {
						for (int b = k; b < k + i; b++)
							inSum += board[a][b];
					}

					if (inSum > max) {
						max = inSum;
					}
				}

			}

		}

		System.out.println("부분 배열내 최대 합: " + max);
	}

	void quiz_2018_05() {

		HashMap<String, String> tree = new HashMap<String, String>();

		String[][] map = new String[][] { { "M", "B" }, { "M", "C" }, { "M", "K" }, { "B", "E" }, { "C", "F" },
				{ "C", "G" }, { "C", "H" }, { "K", "I" }, { "K", "J" }, { "E", "D" }, { "F", "L" }, { "F", "A" },
				{ "E", "E" }, { "F", "L" }, { "F", "A" }, { "H", "N" }, { "H", "O" }, { "J", "P" }, { "J", "Q" } };

		String[] input = new String[] { "F", "N" };

		// init
		for (String[] arr : map) {
			// child , parent 
			tree.put(arr[1], arr[0]);
		}

		// find shared parents
		ArrayList<String>[] p1 = new ArrayList<String>[]();

		
		while(true) {
			if(tree.get(input[0])!=null) {
				p1.add(tree.get(input[0]));
			}

		}
		
		while(true){
			
		}

	}
}
