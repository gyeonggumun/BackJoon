import sys
num = (int) (sys.stdin.readline())
line = 1
while num > line:
    num -= line
    line += 1
# 짝수일경우
if line % 2 == 0:
    a = num
    b = line - num + 1
# 홀수일경우
elif line % 2 != 0:
    a = line - num + 1
    b = num
print(f"{a}/{b}")