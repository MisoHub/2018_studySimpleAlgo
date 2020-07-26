package q42579.bestAlbum;

import java.util.ArrayList;

import java.util.TreeMap;

public class Solution_bck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};

		int[] result = Solution_bck.solution(genres, plays);
		
		for(int i : result) {
			System.out.println("result : "+ i);
		}
	}

	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = new int[plays.length];

		// init map
		TreeMap<Integer, Integer> pmap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < plays.length; i++) {
			pmap.put(plays[i], i);
		}

		ArrayList<Integer> klist = new ArrayList<Integer>(pmap.values());

		// check list
		int cnt = 0;
		while (klist.size() > 0) {

			// select genre
			String checkGenre = genres[klist.get(0)];

			for (int i = 0; i < klist.size(); i++) {

				// has same genre & plays
				if (i < klist.size() - 1 && genres[klist.get(i)] == genres[klist.get(i + 1)]
						&& plays[klist.get(i)] == plays[klist.get(i + 1)]) {

					ArrayList<Integer> plist = new ArrayList<Integer>();

					// add all same song
					plist.add(klist.get(i));

					for (int j = 1; i + j < klist.size() && genres[klist.get(i)] == genres[klist.get(i + j)]
							&& plays[klist.get(i)] == plays[klist.get(i + j)]; j++) {
						plist.add(klist.get(i + j));
						klist.remove(i + j);
					}

					// sort
					plist.sort(null);

					// add
					for (int j = 0; j < plist.size(); j++) {
						answer[plist.get(i)] = cnt++;
					}

				} else if (checkGenre == genres[klist.get(i)]) {
					answer[i] = cnt++;
					klist.remove(i);
				}

			}
		}

		return answer;
	}
}
