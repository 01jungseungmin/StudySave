print("입력할 숫자의 개수는?")

N=int(input())
M=[]
cnt={}

for i in range(N):
    print("숫자를 입력하세요")
    M.append(int(input()))

M=sorted(M)

for i in range(len(M)):
    print(M[i])

for j in M:
    if j in cnt:
        cnt[j] +=1
    else:
        cnt[j]=1

print(cnt)


