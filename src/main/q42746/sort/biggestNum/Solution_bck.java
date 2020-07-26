package q42746.sort.biggestNum;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_bck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 59,594,599,5995,5994};
		System.out.println(Solution_bck.solution(numbers));

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
				while (true) {
					// size check
					if (arg0.length()-1 < i && arg1.length()-1 < i) {
						return 0;
					} else if (arg0.length()-1 < i) {
						if(arg1.charAt(0) < arg1.charAt(i))
							return 1;
						else if(arg1.charAt(0) < arg1.charAt(i))
							return -1;
						return 1;
					} else if (arg1.length()-1 < i) {
						if( arg0.charAt(0) >= arg0.charAt(i))
							return 1;
						return -1;
					}
					// compare char
					if (arg0.charAt(i) > arg1.charAt(i)) {
						return -1;
					} else if (arg1.charAt(i) > arg0.charAt(i)) {
						return 1;
					}else {// same value  
						if(!isLess && arg1.charAt(0) > arg1.charAt(i))
							isLess = true;
						i++;
					}
				}
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
