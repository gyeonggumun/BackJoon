import sys
new_list = []
cnt = 0
for i in range (10):
    n = int(sys.stdin.readline().strip())
    new_list.append(n%42)
print(len(set(new_list)))