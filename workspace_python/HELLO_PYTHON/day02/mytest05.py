# 첫수를 입력하시오 2 
# 끝수를 입력하시오 4
# 배수를 넣으세요  3  
# 2에서 4까지 3의 배수의 합은 3입니다.

from random import random



first = int(input("첫수를 입력하시오"))
last = int(input("끝수를 입력하시오"))
ex = int(input("배수를 넣으세요"))
result = 0;
for i in range(first, last+1):
    if i % ex == 0:
        result += i
print("{}에서 {}까지 {}의 배수의 합은 {}입니다.".format(first,last,ex, result))