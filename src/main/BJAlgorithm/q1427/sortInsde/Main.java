package BJAlgorithm.q1427.sortInsde;

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

		Main main = new Main();

		// get input
/*		Scanner sc = new Scanner(System.in);
		char[] input = String.valueOf(sc.nextInt()).toCharArray();
*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		
		main.innerSort1(token.nextToken().toCharArray());
	}

	public void innerSort1(char[] input) {
		// sort
		Arrays.sort(input);

		// print values..
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(input[i]);
		}

	}

	public void innerSort2(char[] input) {

		// set Character[] list
		Character[] clist = new Character[input.length];
		for (int i = 0; i < input.length; i++)
			clist[i] = input[i];

		Arrays.sort(clist, Collections.<Character>reverseOrder());

		// print values..
		for (Character c : clist)
			System.out.print(c.toString());
	}
}
