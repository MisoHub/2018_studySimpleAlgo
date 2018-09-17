#### Q5. Gene 
: ACGT 문자로 구성된 유전자 염기서열이 존재한다. 두 개의 유전자 염기서열이 주어졌을 때, 다음과 같이 유전자의 유사도similarity 를 구할 수 있다. 

1) 일반measure 유사도방법
유전자 1: A C G T 
유전자 2: C G A T

* 비교
A C G T
	  C G A T  -- 유사도 0
	  
A C G T
	C G A T  -- 유사도 0
	
A C G T
  C G A T  -- 유사도 2
  
A C G T
C G A T  -- 유사도 1

--A C G T
C G A T  -- 유사도 0

----A C G T
C G A T  -- 유사도 1

------A C G T
C G A T  -- 유사도 0

**** 일반 유사도 : 2

             
2) 행렬matrix 유사도방법 
일반 유사도와 유전자를 비교하는 방법은 동일하지만, 각 유전자 비교에 따라 유사도가 다름 

* 예시 행렬 
  A C G T
A 2 1 0 1
C 1 2 1 0
G 0 1 2 1
T 1 0 1 2
	
* 비교
A C G T
	  C G A T  -- 유사도 0
	  
A C G T
	C G A T  -- 유사도 2
	
A C G T
  C G A T  -- 유사도 5
  
A C G T
C G A T  -- 유사도 4

--A C G T
C G A T  -- 유사도 2

----A C G T
C G A T  -- 유사도 3

------A C G T
C G A T  -- 유사도 0	
	 
** 행렬 유사도 : 5


[소문제1] 문자와 숫자 배열을 분리하여 각각 출력하라
[소문제2] 각 문자 사이에 숫자가 위치하도록 배열하고 출력하라 

 

