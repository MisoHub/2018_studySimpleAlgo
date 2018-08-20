package main.BJAlgorithm.q2752.sortNum2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public void mergeSort(int[] input, int start, int end) {

		int mid = (int) ((end - start) / 2) + start;
		if (end - start > 2) {
			// divide
			mergeSort(input, start, mid);
			mergeSort(input, mid, end);
		}
		
		// merge
		if(end-start > 1)
			merge(input, start, end);
	}

	public void merge(int[] input, int start, int end) {

		// get each start point
		int mid = (int) ((end - start) / 2) + start;
		int idx1 = start;
		int idx2 = mid;

		// deep copy from origin Array
		int[] tmpArray = new int[end - start];

		// compare and sort
		for (int i = 0; i < end-start; i++) {
			if ( idx1 >= mid ||  idx2 < end &&  input[idx1] > input[idx2]  )
				tmpArray[i] = input[idx2++];
			else if (idx2 >= end || idx1 < mid && input[idx1] <= input[idx2])
				tmpArray[i] = input[idx1++];
			else
				break;
		}

		// copy to origin
		for (int i = 0; i < end - start; i++) {
			input[start+i] = tmpArray[i];
		}
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
		main.mergeSort(arrInt, 0, arrInt.length);

		// print sorted array
		for (int v : arrInt) {
			System.out.println(v);
		}

	}
}
