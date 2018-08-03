yy = [31, 28, 31, 30, 31, 30,31,31,30,31,30,31]
dd = ["SUN", "MON", "TUE", "WED", "THU", "FRI","SAT"]


def solution(m,d):
    return dd[(sum(yy[0:m-1])+d) % 7]

# input value
m, d = map(int, input().split(" "))

# print result
print(solution(m,d))