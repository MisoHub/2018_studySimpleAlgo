def solution(n):
    stars="*"*n
    for i in range(1,n+1):
        print(stars[:i])

# n=int(input(">>print stars:"))
n=int(input(""))
solution(n)

