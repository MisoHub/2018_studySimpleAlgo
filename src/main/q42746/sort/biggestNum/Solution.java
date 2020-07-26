package q42746.sort.biggestNum;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 59,594,599,5995,5994};
		System.out.println(Solution.solution(numbers));

	}

	public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        
        // convert to String[]
        String[] sNumArr = new String[numbers.length];
        
        for(int i=0; i<numbers.length;i++) {
        	sNumArr[i] = String.valueOf(numbers[i]);
         }
 
        // sort 
        Arrays.sort(sNumArr,new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				
				int i = 0;
				boolean isLess = false;
				
				String s1 = arg0+arg1;
				String s2 = arg1+arg0;
				int i1 = Integer.valueOf(s1);
				int i2 = Integer.valueOf(s2);
				
				if( i1 > i2) {
					return -1;
				}else if (i2>i1) {
					return 1;
				}else 
					return 0;
			}
        });

        // build numbers 
        for(String s : sNumArr) {
        	answer.append(s);
        }

        for(char c : answer.toString().toCharArray()) {
        	if(c !='0')
        		return answer.toString();
        }
        return "0";
    }
}


// 
