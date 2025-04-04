h, m = map(int, input().split())
time = int(input())
m = m +time
if m >= 60:
    h = h+1
    m = m-60
if h >= 24:
    h = h-24
    m = m- (time %60)
print (h, m)