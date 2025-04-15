import sys
n = int (sys.stdin.readline())
gom = set() # 중복되는 채팅을 자동으로 제거해주기 때문에 set사용
cnt = 0 
for _ in range(n):
    user = sys.stdin.readline().strip()
    if user == 'ENTER':
        cnt += len(gom) 
        gom = set()
    else:
        gom.add(user) # add는 집합에 어떤 값을 추가 할 때 사용용
cnt += len(gom)
print(cnt)