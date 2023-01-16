# 첫수를 넣으세요 
# 끝수를 넣으세요 
# 2에서 4까지의 합은 9입니다.

first = input("첫수를 넣으세요")
last = input("끝수를 넣으세요")

aa= int(first) # input은 문자형이기 때문에 숫자로 바꿔줘야함
bb = int(last)
sum = 0

for i in range(aa,bb+1):
    sum += i
print("{}에서 {}까지의 합은{}".format(aa, bb, sum))
