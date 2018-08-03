def solution(n):
    zig=x=y=1
    idx=0

    while n-1>idx:

        if zig%2==1:
            x+=1
            y-=1

            if zig<x:
                y+=1
                zig+=1

        else: # zig is even
            x-=1
            y+=1

            if zig <y:
                x+=1
                zig+=1
        idx+=1
    return ""+str(y)+"/"+str(x)

def solution1(n):
    i=1;
    while n-i>0:
        n-=i
        i+=1
    x=i+1-n
    y=i+1-x
    return  ""+str(x)+"/"+str(y) if i%2==1 else ""+str(y)+"/"+str(x)

print(solution1(int(input())))

