package q42577.phonelist;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] test1 = {"119", "97674223", "1195524421"};
		String[] test2 = {"123","456","789"};
		String[] test3 = {"12","123","1235","567","88"};
		
		System.out.println("test1 :" + checkPhoneList(test1));
		System.out.println("test2 :" + checkPhoneList(test2));
		System.out.println("test3 :" + checkPhoneList(test3));
		

	}
	
	static public boolean checkPhoneList(String[] phone_book) {
		
		for(int i=0; i< phone_book.length;i++) {
			
			for(int j=0; j< phone_book.length;j++) {
				if( phone_book[j].startsWith(phone_book[i]) && i!=j) {
					return false;
				}else
					continue;
			}
		}
		return true;
	}

}
