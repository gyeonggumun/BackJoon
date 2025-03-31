num = (int)(input())
if num < 0 and num > 100:
    print("유효하지 않은 점수입니다.")
elif num >= 90 and num <= 100:
    print("A")
elif num >=80 and num < 90:
    print("B")
elif num >=70 and num < 80:
    print("C")
elif num >= 60 and num < 70:
    print("D")
else:
    print("F")