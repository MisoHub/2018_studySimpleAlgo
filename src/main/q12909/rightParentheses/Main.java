package q12909.rightParentheses;

public class Main {

	static public boolean solution(String s) {

		int level = 0;

		for (char c : s.toCharArray()) {
			level = (c == '(') ? level + 1 : level - 1;
			if (level < 0)
				return false;
		}
		if (level == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution("()()"));
		System.out.println(solution("(()())"));
		System.out.println(solution(")()("));
	}

}
