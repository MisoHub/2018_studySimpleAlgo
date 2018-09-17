package t2018.d0905.Operation;

public class OperationSolution extends Operation {

	public String getCharacters(String input) {
		StringBuilder result=new StringBuilder();
		
		for(char c : input.toCharArray()) {
			if( c<'0' || c>'9') {
				result.append(c);
			}
		}
		return result.toString();
	}
	
	public String getNumbers(String input) {
		StringBuilder result=new StringBuilder();

		for(char c : input.toCharArray()) {
			if( c>='0' && c<='9') {
				result.append(c);
			}
		}
		return result.toString();
	}
	
	
	public String SortNumberString(String input) {
		StringBuilder result=new StringBuilder();
		String chars="";
		String nums="";
		
		chars=getCharacters(input);
		nums=getNumbers(input);
		
		for(int i=0; i<chars.length()-1;i++) {
			result.append(chars.charAt(i));
			result.append(nums.charAt(i));
		}
		result.append(chars.length()-1);
		
		return result.toString();
	}
}
