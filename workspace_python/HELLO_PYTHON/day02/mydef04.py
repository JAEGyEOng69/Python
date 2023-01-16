from random import random
def getLotto():
    arr6= [1,2,3,4,5  ,6,7,8,9,10,  11,12,13,14,15,16,17, 18,19,20,21,
           22,23,24,25, 26,27,28,29, 30,31,32,33,34, 35,36,37,38,39,40, 41,42,43,44,45]
    
    for i in range(100):
        rnd = int(random() * len(arr6))
        a= arr6[0]
        b= arr6[rnd]
        arr6[0]=b
        arr6[rnd]=a
    return arr6[0:6]

arr6 = getLotto()
print(arr6)