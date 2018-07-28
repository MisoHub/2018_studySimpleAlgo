'''
가장 큰 정사각형 찾기
문제 설명
1와 0로 채워진 표(board)가 있습니다. 표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. (단, 정사각형이란 축에 평행한 정사각형을 말합니다.)

예를 들어

1	2	3	4
0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
가 있다면 가장 큰 정사각형은

1	2	3	4
0	1	1	1
1	1	1	1
1	1	1	1
0	0	1	0
가 되며 넓이는 9가 되므로 9를 반환해 주면 됩니다.

제한사항
표(board)는 2차원 배열로 주어집니다.
표(board)의 행(row)의 크기 : 1000 이하의 자연수
표(board)의 열(column)의 크기 : 1000 이하의 자연수
표(board)의 값은 1또는 0으로만 이루어져 있습니다.
입출력 예
board	answer
[[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]	9
[[0,0,1,1],[1,1,1,1]]	4
입출력 예 설명
입출력 예 #1
위의 예시와 같습니다.

입출력 예 #2
| 0 | 0 | 1 | 1 |
| 1 | 1 | 1 | 1 |
로 가장 큰 정사각형의 넓이는 4가 되므로 4를 return합니다.
'''
#
# def calcSquare(x,y,board):
#     if board[x][y] == 0:
#         return 0
#     elif x>=len(board)-1 or y>=len(board[x])-1:
#         return 1
#     else:
#         return  min(calcSquare(x+1,y,board),calcSquare(x,y+1,board),calcSquare(x+1,y+1,board))+1
#
# def solution(board):
#     max_size=i=0
#     while i < (len(board) - max_size):
#         j=0
#         while j < (len(board[i]) - max_size):
#             if board[i][j] != 0:
#                 result = calcSquare(i,j,board)
#                 max_size = result if max_size < result else max_size
#             j+=1
#         i+=1
#     return max_size*max_size
# 결과는 제대로 나오나 성능이 제대로 나오지 않음.


def calcSquare(x,y,board):
    if x < len(board)-1 and y<len(board[x])-1 and board[x][y]!=0:
        board[x][y] = (min(board[x + 1][y], board[x][y + 1], board[x + 1][y + 1]) + 1)
    return board[x][y]

def solution(board):
    import math
    max = 0
    for i in range(len(board)-1,-1,-1):
        for j in range(len(board[i])-1,-1,-1):
           max = calcSquare(i,j,board) if calcSquare(i,j,board) >max else max
    # return int(math.pow(max(sum(board,[])),2))
    return max*max

# print(solution([[0,0,0,0],[0,1,1,0],[0,1,1,1],[0,0,1,1]]))
print(solution([[0,1,1,1],[1,1,1,1],[1,1,1,1],[0,0,1,0]]))
'''
테스트 결과 
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.05ms, 12.2MB)
테스트 2 〉	통과 (0.10ms, 12.1MB)
테스트 3 〉	통과 (0.10ms, 12MB)
테스트 4 〉	통과 (0.12ms, 12.1MB)
테스트 5 〉	통과 (0.11ms, 12MB)
테스트 6 〉	통과 (0.06ms, 12.3MB)
테스트 7 〉	통과 (0.06ms, 12.1MB)
테스트 8 〉	통과 (0.07ms, 12.1MB)
테스트 9 〉	통과 (0.08ms, 12.1MB)
테스트 10 〉	통과 (0.11ms, 12.3MB)
테스트 11 〉	통과 (0.07ms, 12MB)
테스트 12 〉	통과 (0.08ms, 12.1MB)
테스트 13 〉	통과 (0.06ms, 12MB)
테스트 14 〉	통과 (0.10ms, 12.1MB)
테스트 15 〉	통과 (0.10ms, 12.2MB)
테스트 16 〉	통과 (0.11ms, 12.1MB)
테스트 17 〉	통과 (0.11ms, 12.1MB)
테스트 18 〉	통과 (1.75ms, 12.1MB)
테스트 19 〉	통과 (1.61ms, 12.3MB)
효율성  테스트
테스트 1 〉	통과 (726.85ms, 739MB)
테스트 2 〉	통과 (741.89ms, 739MB)
테스트 3 〉	통과 (750.16ms, 739MB)
'''
'''
[
[0,1,1,1],
[1,1,1,1],
[1,1,1,1],
[0,0,1,0]
]

[
[0, 0, 1, 1], 
[1, 1, 1, 1]
]

[[1,1,1],[1,1,1],[1,1,1,1]]

[[0,0,0,0],[0,0,1,1],[0,0,1,1],[0,0,1,1]]
[
[0,0,0,0],
[0,0,1,1],
[0,0,1,1],
[0,0,1,1]]



[[0,0,0,0],[0,1,1,0],[0,1,1,1],[0,0,1,1]]
[
[0,0,0,0],
[0,1,1,0],
[0,1,1,1],
[0,0,1,1]]
'''