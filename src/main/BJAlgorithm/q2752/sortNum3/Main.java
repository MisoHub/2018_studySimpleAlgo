package main.BJAlgorithm.q2752.sortNum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public void radixSort(int[] input) {

		boolean bZero;
		int radix=1;
		int idx =0;
			
		// create bucket 
		ArrayList<Integer>[] arrList = new ArrayList[10];
		for( int i=0;i<arrList.length; i++) {
			arrList[i] = new ArrayList<Integer>();
		}
			
		do {
			// get base
			int base = (int)Math.pow(10, radix++);
			idx =0;
			bZero = true;
			
			// put numbers into bucket
			for (int i = 0; i < input.length; i++) {
				int nIndex =(int)input[i]%base*10/base; 
				arrList[nIndex].add(input[i]);
				if(nIndex != 0) {	bZero = false;	}
			}
			
			// get numbers from bucket 
			for(int i=0; i<10;i++) {
				if(idx >= input.length)
					break;
				for(int j=0; j<arrList[i].size();j++) {
					input[idx++] = (int)arrList[i].get(j);					
				}
			}
			
			// clean bucket 
			for(int i=0; i<10; i++) {
				arrList[i].clear();
			}
		// end if every value is 0.
		} while (!bZero);
	}

	public static void main(String[] args) {

		Main main = new Main();

		// get input
		Scanner sc = new Scanner(System.in);
		int[] arrInt = new int[sc.nextInt()];

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = sc.nextInt();
		}

		// merge sort
		main.radixSort(arrInt);

		// print sorted array
		for (int v : arrInt) {
			System.out.println(v);
		}

	}
}
