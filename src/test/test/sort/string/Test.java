package test.sort.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 문자열 단순 정렬 
		String s1 = "edgs3dgfsczf";
		char[] c1= s1.toCharArray();
		Arrays.sort(c1);
		
		System.out.println("s1:"+s1);
		System.out.println("c1:"+String.valueOf(c1));
		
		
		//2. 문자열 역순으로 정렬 
		String s2 = new StringBuilder(String.valueOf(c1)).reverse().toString();
		System.out.println("reversed c1:"+s2);
		
		
		//3. 숫자가 문자보다 뒤에 위치하게 정렬 
		Character[] wc = s1.chars().mapToObj(c->(char)c).toArray(Character[]::new); // test.convert.string#1 참조 
		
		Arrays.sort(wc, new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				// TODO Auto-generated method stub
				if('0'<= c1 && c1 <='9') {
					if(c2<'0' || '9' <c2 ) {
						return Character.compare(c2, c1);
					}
				}else {
					if('0'<= c2 && c2 <='9') {
						return Character.compare(c2, c1);
					}
				}
				return Character.compare(c1, c2);
			}
			
		});
		
		StringBuilder sb1 = new StringBuilder();
		for(Character c : wc)
			sb1.append(c.charValue());
		System.out.println("custom c1: " + sb1.toString());

		//
		ArrayList<Integer>	al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(2,13);
		al2.remove(0);
		System.out.println(al2);
	}


}
