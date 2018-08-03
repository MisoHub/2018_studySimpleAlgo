def solution(n):
    i=0
    while n > 0:
        i+=1
        n-=i*6

    return i+1
n=int(input(">> beehouse :"))
print(solution(n-1))

