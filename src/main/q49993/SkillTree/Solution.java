package q49993.SkillTree;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		System.out.println(s.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
//		System.out.println(s.solution("CBD", new String[] {"CD", "CB", "A", "C"}));

	}
	
    public int solution(String skill, String[] skill_trees) {
        
    	int answer = 0;
        char[] sOrder = skill.toCharArray();
        
        for(String s : skill_trees) {
        	char[] stmp = s.toCharArray();
        	StringBuffer sb = new StringBuffer();
        	
        	for(int i=0; i<stmp.length; i++) {
        		for( char c : sOrder) {
        			if(c == stmp[i]) {
        				sb.append(stmp[i]);
        				break;
        			}
        		}
        	}
        	
        	if(sb.length() > 0 && skill.indexOf(sb.toString())!=0) {
        		continue;
        	}
        	
        	answer++;
        }

        return answer;
    }

}
