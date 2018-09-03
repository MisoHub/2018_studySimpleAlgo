package BJAlgorithm.q10989.sortNum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Main main = new Main();

		// get input
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrInt = new ArrayList();
		ArrayList<Integer> result = new ArrayList();
		
		int testn = sc.nextInt();
		
		for (int i = 0; i < testn; i++) {
			arrInt.add(sc.nextInt());
		}

		//	arrInt = main.radixSort1(arrInt);
	
		// find max length
		int maxlen = 0;
		for(int i: arrInt) {
			int tlen = String.valueOf(i).length();
			if(tlen>maxlen)
				maxlen = tlen;
		}
			
		
		main.radixSortR(arrInt, maxlen, result);

		// print sorted array
		for (int v : result) {
			System.out.println(v);
		}

	}

	public void radixSortR(ArrayList<Integer> arrInput, int npow, ArrayList<Integer> result) {

		boolean bZero;
		int radix = 1;
		int idx = 0;

		// create bucket
		ArrayList<Integer>[] nBucket = new ArrayList[arrInput.size()];
		for (int i = 0; i < nBucket.length; i++) {
			nBucket[i] = new ArrayList<Integer>();
		}

		// sorting..
		while (arrInput.size() != 0) {
			// get base
			int base = (int) Math.pow(10, npow);
			idx = 0;
			bZero = true;

			// put numbers into bucket
			for (int i = 0; i < arrInput.size(); i++) {
				nBucket[(int) arrInput.get(i) % base * 10 / base].add(arrInput.get(i));
			}

			// clear tmpData
			arrInput.clear();

			// get numbers from bucket
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < nBucket[i].size();) {
					
					if(nBucket[i].size()==1) {
						result.add(nBucket[i].get(0));
						nBucket[i].remove(0); // remove the number from the bucket
					}else {
						radixSortR(nBucket[i], npow-1, result);		
						nBucket[i].clear();
					}
				}
			}
		}

		// return Arrays.stream(arrList[0].toArray(new
		// Integer[input.length])).mapToInt(i->i).toArray();
	}


	public int[] radixSort1(int[] input) {

		boolean bZero;
		int radix = 1;
		int idx = 0;

		ArrayList<Integer>[] arrList = new ArrayList[10];
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> tmpData = new ArrayList<Integer>();

		// copy input into tmpData
		for (int i = 0; i < input.length; i++) {
			tmpData.add(input[i]);
		}

		// create bucket
		for (int i = 0; i < arrList.length; i++) {
			arrList[i] = new ArrayList<Integer>();
		}

		// sorting..
		while (tmpData.size() != 0) {
			// get base
			int base = (int) Math.pow(10, radix++);
			idx = 0;
			bZero = true;

			// put numbers into bucket
			for (int i = 0; i < tmpData.size(); i++) {
				arrList[(int) tmpData.get(i) % base * 10 / base].add(tmpData.get(i));
			}

			// clear tmpData
			tmpData.clear();

			// get numbers from bucket
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < arrList[i].size();) {
					int radNum = (int) arrList[i].get(j) % base;
					// remove sorted numbers..
					if (radNum == arrList[i].get(j)) {
						result.add(arrList[i].get(j));
						arrList[i].remove(j); // remove the number from the bucket
					} else {
						tmpData.add(arrList[i].get(j));
						arrList[i].remove(j); // remove the number from the bucket
					}
				}
			}
		}

		// return Arrays.stream(arrList[0].toArray(new
		// Integer[input.length])).mapToInt(i->i).toArray();
		return Arrays.stream(result.toArray(new Integer[result.size()])).mapToInt(i -> i).toArray();

	}
}
