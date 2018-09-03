package BJAlgorithm.q2108.Statistics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {

	static Scanner sc = null;
	private ArrayList<Integer> arrList = null;
	private int testn = 0;

	public Main() {
		sc = new Scanner(System.in);
		testn = sc.nextInt();

		arrList = new ArrayList<Integer>();

		for (int i = 0; i < testn; i++) {
			arrList.add(sc.nextInt());
		}

		arrList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if (arg0 > arg1)
					return 1;
				else if (arg0 < arg1)
					return -1;
				else
					return 0;
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		System.out.println(main.getAvg());
		System.out.println(main.getMid());
		System.out.println(main.getMost());
		System.out.println(main.getRange());
	}

	public int getMid() {
		return arrList.get(arrList.size() / 2);
	}

	public int getAvg() {
		return (int) Math
				.round(IntStream.of(arrList.stream().mapToInt(Integer::intValue).toArray()).average().getAsDouble());
	}

	public int getMost() {
		// make hash map 
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		for (int v : arrList) {
			if (tm.containsKey(v)) {
				tm.put(v, tm.get(v) + 1);
			} else {
				tm.put(v, 1);
			}
		}
		// find max value 
		int max = tm.values().stream().mapToInt(i -> -i).sorted().toArray()[0]*-1;
		int ret=0,cnt = 0;
		// find second most value 
		for (int v : new ArrayList<Integer>(tm.keySet()).stream().mapToInt(Integer::intValue).toArray()) {
			if (tm.get(v) == max) {
				ret = v;
				if (++cnt == 2)
					return v;
			}
		}
		return ret;
	}

	public int getRange() {
		return arrList.get(arrList.size() - 1) - arrList.get(0);
	}
}
