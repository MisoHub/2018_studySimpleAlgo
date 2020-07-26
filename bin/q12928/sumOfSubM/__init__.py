'''
약수의 합
문제 설명
자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 자연수입니다.
입출력 예
n	return
12	28
5	6
입출력 예 설명
입출력 예 #1
12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

입출력 예 #2
5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
'''

def solution(n):
    import math
    answer = 0
    for v in range(1,round(math.sqrt(n))+1):
        if n%v  == 0 :
            answer += v
            answer += n//v if v!= n//v else 0
            # if v != n//v:
            #     answer += n//v
    return answer


# 다른사람 풀이
# #
# def solution1(n):
#     return n + sum([i for i in range(1, (n // 2) + 1) if n % i == 0])


# import time
# start_time = time.time()
# print(solution1(30000000))
# print("--- %s seconds ---" % (time.time() - start_time))
# start_time = time.time()
# print(solution(30000000))
# print(time.time() - start_time)
#
# time.time()