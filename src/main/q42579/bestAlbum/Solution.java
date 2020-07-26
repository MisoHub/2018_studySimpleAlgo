package q42579.bestAlbum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.TreeMap;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] genres = 
			{"classic", "pop", "classic", "pop", "classic", "classic"};
//			{"classic", "pop", "jazz", "classic", "classic", "pop", "jazz"};
//			{"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {400, 600, 150, 2500, 500, 500};
//			{500, 600, 3100,150, 800, 2500,3100};
//			{500, 600, 150, 800, 2500};
		
		int[] result = Solution.solution(genres, plays);
		
		System.out.println(result.length);
		for(int i : result) {
			System.out.print(i + ",");
		}
	}

	public static int[] solution(String[] genres, int[] plays) {
		
		
		// get sum of genres 
		TreeMap<String,Integer> sumlist = new TreeMap<String,Integer>();

		for(int i=0; i<plays.length;i++) {
			if(sumlist.containsKey(genres[i])) {
				sumlist.replace(genres[i],sumlist.get(genres[i]) + plays[i]);
			}else {
				sumlist.put(genres[i],plays[i]);
			}
		}
		
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// sort plays 
		LinkedList<Integer> orderedPlaysList = new LinkedList<Integer>();
				
		int[] tmpPlays = Arrays.copyOf(plays, plays.length); 
		// insert & sort arrays
		for(int i=0; i<tmpPlays.length; i++) {
			int maxIndex=0, maxNum = 0;
			
			for (int j =0; j<tmpPlays.length; j++) {
				if( maxNum < tmpPlays[j]) {
					maxNum = tmpPlays[j];
					maxIndex = j;
				}
			}
//			orderedPlaysList.add(plays[maxIndex]);
			orderedPlaysList.add(maxIndex);
			tmpPlays[maxIndex] = -1;	
		}
		
		
		// select best song & add 

		String[] genrelist = sumlist.keySet().toArray(new String[sumlist.size()]);
		while(orderedPlaysList.size()>0) {

			//set best song genre
			String selectedGenre = null;
			int maxSum = -1;
			
			for (int i = 0; i < genrelist.length; i++) {
				int tmp = sumlist.get(genrelist[i]).intValue();
				if (maxSum < tmp) {
					maxSum = tmp;
					selectedGenre = genrelist[i];
				}
			}
			
			sumlist.replace(selectedGenre, -1);
		
			// explore same genre song
			int size = orderedPlaysList.size();
			int numFounded = 0;
			for(int i=0;i<size;i++) {
				int tmpIndex = orderedPlaysList.get(i);
				if(numFounded<2 && selectedGenre.contentEquals(genres[tmpIndex])) {
					result.add(tmpIndex);
					numFounded++;
					orderedPlaysList.remove(i);
					i = i-1; 
					size = size -1;
				}else if (numFounded>=2 && selectedGenre.contentEquals(genres[tmpIndex])) {
					orderedPlaysList.remove(i);
					i = i-1; 
					size = size -1;
				}
			}
		}

		//make return value
		return result.stream().mapToInt(i->i).toArray();
	}
}
