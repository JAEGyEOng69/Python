# 1~100까지의 정수중 3의 배수의 합을 구허시오
a = list(range(1,101))
sum =0
for i in a:
    if i % 3==0:
        sum += i
print(sum)

