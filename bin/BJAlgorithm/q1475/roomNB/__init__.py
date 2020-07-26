
def solution(n):
    nstr = str(n)
    nlist = [ 0 for i in range(0,10)]
    for i in list(nstr):
        nlist[int(i)]+=1
    nlist[9]=nlist[6]= (nlist[6]+nlist[9])//2 if (nlist[6]+nlist[9])%2==0 else (nlist[6]+nlist[9])//2+1
    return max(nlist)

nroom = int(input())
print(solution(nroom))
