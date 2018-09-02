package q12948.phoneMasking;

public class Main {

	static public String solution(String phone_number) {
		char[] arr = phone_number.toCharArray();
		for (int i = 0; i < arr.length - 4; i++) {
			arr[i] = '*';
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}

}
