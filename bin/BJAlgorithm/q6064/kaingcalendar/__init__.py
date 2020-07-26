def solution(m,n,x,y):
    import math
    lcm = int(m*n/ math.gcd(m,n)) # gcd = 최대공약수 = 유클리드 호제법
    idx = 0
    while idx*m+x <= lcm:
        if n == y :
            if (idx*m+x)%n == 0 :
                return idx*m+x
            else:
                idx += 1
                continue
        else:
            if (idx*m+x)%n == y:
                return idx*m+x
            else:
                idx+=1
                continue
    return -1

# get test num
nTest = int(input())
inputList=[]

# get inputs
for i in range(0,nTest):
    m ,n, x, y = map(int, input().split(" "))
    inputList.append([m ,n, x, y ])

# print results
for v in inputList:
    print(solution(v[0],v[1],v[2],v[3]))


