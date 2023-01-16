# 로또 생성하시오 
# 1~45랜덤 6개 출력
# import random
# alist = []
# for i in range(6):
#     rnd = random.randint(1, 46)
#     alist.append(rnd)
# print(alist)
 
from dask.array.random import random

arr45 = [1,2,3,4,5  ,6,7,8,9,10]
# arr45 = range(1, 45+1)
for i in range(100):
    rnd = int (random() * len(arr45))
    #print("rnd값",rnd)
    a= arr45[0]
    b= arr45[rnd]
    arr45[0]=b
    arr45[rnd]=a
print(arr45[0:6])
