package q42578.spy;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	public int solution(String[][] clothes) {
	
		int answer = 1;
	
		// init cmap 
		HashMap<String,ArrayList<String>> cmap = new HashMap<String,ArrayList<String>>();
	
		for(int i = 0; i<clothes.length ; i++) {
			if(cmap.containsKey(clothes[i][1])) {
				cmap.get(clothes[i][1]).add(clothes[i][0]);
			}else {
				ArrayList<String> vlist = new ArrayList<String>();
				vlist.add(clothes[i][0]);
				cmap.put(clothes[i][1], vlist);
			}
		}
		
		
		ArrayList kset = new ArrayList(cmap.keySet());
		// compute cases
		
		for(int i=0; i<kset.size();i++)
			answer = answer * (cmap.get(kset.get(i)).size()+1);
		
		return answer-1;
	}
}
