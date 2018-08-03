# def solution(x,y):
#     if x == 0:
#         return y
#     elif y == 1:
#         return 1
#     else:
#         return solution(x-1,y) + solution(x,y-1)


def solution2(x,y):
    board=[list(range(0,y+1))]
    for i in range(1,x+1):
        tmp = []
        for j in range(0,y+1):
            if j <= 1:
                tmp.append(j)
            else:
                tmp.append(tmp[j-1]+board[i-1][j])

        board.append(tmp)

    return  board[x][y-1] + board[x-1][y]

# get input data
ntest = int(input())
ilist = []

for i in range(0,ntest*2):
    ilist.append(int(input()))

for i in range(0,ntest):
    print(solution2(ilist[i*2],ilist[i*2+1]))