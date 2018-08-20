package BJAlgorithm.q1181.sortWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<String> arrList = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testn = Integer.parseInt(br.readLine());
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		while (token.hasMoreTokens()) {
			arrList.add(token.nextToken());
		}

		Main.sortWords((String[]) arrList.toArray());
	}

	static public void sortWords(String[] input) {
		// sort
		Arrays.sort(input, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub

				if (arg0.length() > arg1.length())
					return 1;
				else if (arg0.length() < arg1.length())
					return -1;
				else {
					return arg0.compareTo(arg1);
				}
			}

		});
	}

}
