package q12947.hashard;

public class Main {

	public boolean solution(int x) {
	    
	char[] arr = String.valueOf(x).toCharArray();
	int sum = 0;
	
	for(int i = 0; i<arr.length ; i++) {
		sum = sum + (int)arr[i] - (int)'0';
	}
	
	return  (x %sum==0)?true:false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		
		System.out.println(main.solution(10));
		System.out.println(main.solution(12));
		System.out.println(main.solution(11));
		System.out.println(main.solution(13));
		
	}

}
