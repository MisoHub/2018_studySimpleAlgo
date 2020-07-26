package skillcheck.q136559.maxsquare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = 
//			{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
//				{{0,0,1,1},{1,1,1,1}};
//				{{0,0},{1,1},{1,1},{0,0}};
//		{{1,1,1},{0,1,1},{1,1,1}};
		{{0,1,1,0}};
		System.out.println(Main.solution(input));
	}

	public static int solution(int[][] board) 
	{
		int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {

				if (board[i][j] == 0)
					continue;
				
				if (answer/2 >= (board.length-i)*(board[i].length-j))
					return answer;

				int width=1;
				boolean isFilled=true;
				while(j+width-1 < board[i].length && i+width-1 < board.length ) {
					
					//check last column
					for(int h=i;h<board.length || h<i+width; h++) {
						if(board[h][j+width-1]!=1)
							isFilled=false;
							break;
					}
					
					// check last row 
					for(int w=j; w < board[i].length || w<j+width; w++) {
						if(board[i+width-1][w]!=1)
							isFilled=false;
							break;
					}
					
					if(isFilled) {
						width++;
					}else
						break;
				}
				answer = answer < width*width?width*width:answer;
			}
		}
		return answer;
	}

}









//
//1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 
//표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)
//
//		제한사항
//		표(board)는 2차원 배열로 주어집니다.
//		표(board)의 행(row)의 크기 : 1,000 이하의 자연수
//		표(board)의 열(column)의 크기 : 1,000 이하의 자연수
//		표(board)의 값은 1또는 0으로만 이루어져 있습니다.
