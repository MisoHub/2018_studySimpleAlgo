package q12940.lcmgcd;

public class Main {
	

	  public int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      answer[0] = getLCM(n,m);
	      answer[1] = getGCD(n,m);
	      return answer;
	  }
	  
	  

	int getGCD(int a, int b) {
		return a*b/getLCM(a,b);
	}
	
	int getLCM(int a, int b) {
		// 유클리드 호제법 
		if(a<b) {
			int tmp = a;
			a = b; 
			b = tmp;
		}
		
		if(a%b != 0)
			return getLCM(b,a%b);
		else 
			return b;
	}
	
	void printSolution(int[] sol) {
		System.out.print("[");
		for(int i: sol) {
			System.out.print(i);
		}
		System.out.println("]");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		System.out.println(main.getLCM(144, 30));
		System.out.println(main.getGCD(256, 38));
		
		main.printSolution(main.solution(3, 12));
		main.printSolution(main.solution(2,5));
	}

}
