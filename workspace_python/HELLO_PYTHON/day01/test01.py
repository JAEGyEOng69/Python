# 1~100까지의 정수중 3의 배수의 합을 구허시오
# a = list(range(1,101))
sum =0
# for i in a:
#     if i % 3==0:
#         sum += i
# print(sum)



#i는 숫자가 아니라 아이템 
for i in range(1, 101):
    if i % 3 == 0:
        sum += i
        print(i)
print("sum",sum)