def solution(dists):
    import math
    result =[]
    for i in dists:
        if i <= 3:
            result.append(i)
            continue
        nroot = int(math.sqrt(i))
        tmp = int(math.pow(nroot,2))
        if i == tmp :
            result.append(int(nroot * 2 - 1))
        elif i-tmp < math.sqrt(i):
            result.append(int(nroot) * 2 )
        else:
            result.append((int(nroot)) * 2 + 1)
    return result


nTest = int(input())
ldist = [];
for i in range(0,nTest):
    a, b = map(int, input().split(" "))
    ldist.append(b-a)
result = solution(ldist)

for v in result:
    print(v)


