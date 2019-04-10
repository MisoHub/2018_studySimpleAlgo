package test.convert.string;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. char[] to Character[]
		String s1 = "1q2w3e4r5t6y";
		char[] c1 = s1.toCharArray();
		Character[] wc = s1.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		System.out.println(Arrays.toString(wc));

	}

}
