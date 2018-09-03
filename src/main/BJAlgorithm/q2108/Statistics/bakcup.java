package BJAlgorithm.q2108.Statistics;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.TreeMap;
//import java.util.stream.IntStream;
//
//public class bakcup {
//
//	static Scanner sc = null;
//	private TreeMap<Integer, Integer> tm = null;
//	private int testn = 0;
//
//	public bakcup() {
//		sc = new Scanner(System.in);
//		testn = sc.nextInt();
//
//		tm = new TreeMap<Integer, Integer>();
//
//		for (int i = 0; i < testn; i++) {
//			int input = sc.nextInt();
//			if (tm.containsKey(input)) {
//				tm.put(input, tm.get(input) + 1);
//			} else {
//				tm.put(input, 1);
//			}
//		}
//	}
//
//	/*public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		MainBack main = new MainBack();
//		System.out.println(main.getAvg());
//		System.out.println(main.getMid());
//		System.out.println(main.getMost());
//		System.out.println(main.getRange());
//	}
//*/
//	public int getMid() {
//		return new ArrayList<Integer>(tm.keySet()).get(tm.size() / 2);
//	}
//
//	public int getAvg() {
//		return (int) Math.round(IntStream.of(new ArrayList<Integer>(tm.keySet()).stream().mapToInt(Integer::intValue).toArray()).sum()*1.0
//				/ Math.round(IntStream.of(new ArrayList<Integer>(tm.values()).stream().mapToInt(Integer::intValue).toArray()).sum()));
//	}
//
//	public int getMost() {
//		int max = tm.values().stream().mapToInt(i -> -i).sorted().toArray()[0]*-1;
//		int cnt = 0;
//		int ret = 0;
//		int[] keyList = new ArrayList<Integer>(tm.keySet()).stream().mapToInt(Integer::intValue).toArray();
//
//		for (int v : keyList) {
//			if (tm.get(v) == max) {
//				ret = v;
//				if (++cnt == 2)
//					return v;
//			}
//		}
//		return ret;
//	}
//
//	public int getRange() {
//		return tm.lastKey() - tm.firstKey();
//	}
//}
