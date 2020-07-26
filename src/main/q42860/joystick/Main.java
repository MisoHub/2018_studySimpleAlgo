package q42860.joystick;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("JAZ"));

	}
	
    public static int solution(String name) {
        int answer = 0;
        
        int[] joyMap = new int[name.length()];
        for(int i=0;i<name.length(); i++) {
        	joyMap[i] = (int)(name.charAt(i)-'A');
        }
        
        // check right side
        int right=0, rpos=0;
        
        for(int i=1;i<joyMap.length;i++) {
        	rpos++;
        	if(joyMap[i]==0) {
        		continue;
        	}else {
        		if(rpos-1 >= joyMap.length/2) {
        			right = right*2+(joyMap.length-right-rpos);
        			break;
        		}
        		right+=rpos;
        		rpos=0;
        	}
        }
        // check left side
        int left=0, lpos=0;
        for(int i=joyMap.length-1;i>0;i--) {
        	lpos++;
        	if(joyMap[i]==0) {
        		continue;
        	}else {
        		if(left-1 >= joyMap.length/2) {
        			left = left*2+(joyMap.length-left-lpos);
        			break;
        		}
        		left+=lpos;
        		lpos=0;
        	}
        }
        
        for(int i : joyMap) {
        	answer += i<14?i:26-i;
        }
        answer = right<=left?answer+right:answer+left;
        return answer;
    }

}
