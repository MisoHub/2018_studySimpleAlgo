package skillcheck.q136859.metrixMul;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length;i++){
            for(int j =0; j<arr2[0].length;j++){
                for(int k=0;k<arr2.length;k++){
                    answer[i][j] +=  arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}

//https://ko.wikipedia.org/wiki/%ED%96%89%EB%A0%AC_%EA%B3%B1%EC%85%88