def solution(h,w,n):
    return ((n % h)*100 + n//h +1) if n%h !=0 else h*100+n//h

## input test case
ntest = int(input())

## test values
clist = []

# get input data
for i in range(0,ntest):
    h,w,n = map(int, input().split(" "))
    clist.append([h,w,n])

# print results
for l in clist:
    print(solution(l[0],l[1],l[2]))