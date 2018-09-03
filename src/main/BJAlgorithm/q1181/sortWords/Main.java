package BJAlgorithm.q1181.sortWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		// test case 1. 
		// get input count
		String[] strArr = new String[Integer.parseInt(br.readLine())];
		
		// get input strings
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = br.readLine();
		}

		// sort
		Main.sortWords(strArr);

		// print 
		System.out.println(strArr[0]);
		for (int i = 1; i< strArr.length; i++) {
			if(!strArr[i-1].equals(strArr[i]))
				System.out.println(strArr[i]);
		}*/
		
		// test case 2. 
		int testn = Integer.parseInt(br.readLine());
		HashSet<String> hs = new HashSet<String>();
		
		// insert words into set 
		for(int i=0; i<testn; i++) {
			hs.add(br.readLine());
		}
		
		String[] strArr = hs.toArray(new String[hs.size()]);
		sortWords(strArr);
		
		for(String v : strArr) {
			System.out.println(v);
		}
		
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
