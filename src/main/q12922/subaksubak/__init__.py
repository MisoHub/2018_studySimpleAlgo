'''
수박수박수박수박수박수?
문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	수박수
4	수박수박
'''

def solution(n):

    isOdd = True if n%2==1 else False
    target = n+1 if isOdd else n
    nList=[]
    div = 2
    answer = "수박"

    while(div<=target):
        if(target%div == 0):
            nList.append(div)
            target = target/div
            continue
        div+=1

    for m in nList[1:]:
        answer *= m

    return answer[:-1] if isOdd else answer


'''
다른사람풀이
def solution(n):
    s = "수박" * (n//2+1)
    return s[:n]
'''