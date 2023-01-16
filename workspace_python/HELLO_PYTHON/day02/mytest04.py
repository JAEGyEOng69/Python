# 홀/짝을 입력하시오 
# 나 : 홀 
# 컴 : 홀  
# 결과 : 승리
from random import random



user = input("홀/짝 입력하시오")

rnd = random()

if   rnd > 0.5:
    computer = "홀"
    
else:
    computer = "짝"

if computer == user:
    result ="승리"
else:
    result ="패배"
    
print(user)
print(computer)
print(result)