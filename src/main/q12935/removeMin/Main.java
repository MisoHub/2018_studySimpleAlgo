package q12935.removeMin;

public class Main {
	
	static public int[] solution(int[] arr) {
	
		if(arr.length < 2) {
			int[] results = {-1,};
			return results;
		}else {
			int[] results = new int[arr.length-1];
			int minIndex = -1;
			int tmp = Integer.MAX_VALUE;

			// find smallest num  
			for(int i=0; i<arr.length;i++) {
				if(arr[i]<tmp) {
					tmp = arr[i];
					minIndex = i-1;
				}
			}
			
			// remove smallest num;
			for(int i=0; i<arr.length-1; i++) {
				
				if(i>minIndex)
					results[i]=arr[i+1];
				else
					results[i] = arr[i];
			}
			return results;
		}
	}
	
	public static void main (String[] args) {
		int[] input1 = {4,3,2,1};
		int[] input2 = {10};
		int[] input3 = {4,3,2,1,10,9};
		
		for(int i :Main.solution(input1))
			System.out.print(i+" ");
	}

}
