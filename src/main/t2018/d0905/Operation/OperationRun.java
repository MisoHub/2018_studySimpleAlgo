package t2018.d0905.Operation;

public class OperationRun {

	
	public static void main(String[] args) {
		
//		Operation op = new Operation();
		OperationSolution op = new OperationSolution();
		
		String input1 = "ABDTG4561";
		String input2 = "1A4B6C2D5EF4G54H6P7I8A9B0G9DK";
		
		runTest(op,input2);
		
	}
	
	public static void runTest(Operation op, String input) {
		System.out.println("*****1.문자만 출력*****");
		System.out.println(op.getCharacters(input));
		System.out.println("*****2.숫자만 출력*****");
		System.out.println(op.getNumbers(input));
		System.out.println("*****3.문자/숫자 사이 정렬*****");
		System.out.println(op.SortNumberString(input));
	}
}
