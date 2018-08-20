package BJAlgorithm.q2750.sortNum1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner sc = null;

	public Main() {
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get The number of test-case
		Main main = new Main();
		main.printArray(main.sortNumbers(main.initIntegerArray(sc.nextInt())));
		
//		main.sortWithTreeMap(sc.nextInt());
	
	}

	public int[]  initIntegerArray(int nTest) {
		int[] nArray = new int[nTest];

		for (int i = 0; i < nTest; i++) {
			nArray[i] = sc.nextInt();
		}
		return nArray;
	}

	public int[] sortNumbers(int[] input) {
		// start comparing at idx 1.
		for (int i = 1; i < input.length; i++) {
			// comparing
			for (int j = 0; j < i; j++) {
				if (input[j] > input[i]) {
					// insert input[i] into j
					this.insertAt(input, j, i);
					break;
				}
				else if (input[j] == input[i]) {
					// duplicated value
//					input[i] = 0;
					this.insertAt(input, j+1, i);
					break;
				}
				else
					continue;
			}
		}

		return input;
	}

	public void insertAt(int[] input, int index, int valueIndex) {

		// change with last value
		int tmp = input[valueIndex];
		input[valueIndex] = input[input.length - 1];
		input[input.length - 1] = tmp;

		// push back one space
		for (int i = input.length - 1; i > index; i--) {
			input[i] = input[i-1];
		}

		// insert value
		input[index] = tmp;
	}
	
	public void sortWithTreeMap(int nTest) {
		  TreeMap<Integer, Integer> tmap = new TreeMap<Integer,Integer>();
		  for(int i =0; i<nTest; i++) { int tmp = sc.nextInt(); tmap.put(tmp, tmp); }
		  for(int i: tmap.values()) { System.out.println(i); }
	}

	public void printArray(int[] input) {
		for (int v : input) {
//			if( v != 0)
//				System.out.format("%d ", v);
				System.out.println(v);
		}
		
	}
}
