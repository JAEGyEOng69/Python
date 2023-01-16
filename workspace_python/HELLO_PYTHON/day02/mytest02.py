# 출력원하는 단수를 입력하세요 5
# 5*1=5
from astropy.units import Gu

dan = input("단을 입력하세요")
adan = int(dan)
print("==========={}단==========".format(adan))
gu=0
for i in range(1,10):
    gu = adan * i
    print("{} X {} = {} ".format(adan, i,gu))