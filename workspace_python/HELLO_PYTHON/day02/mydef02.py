

for i in range(2,9+1):
    if i % 2==1:
        continue
    for a in range(1,9+1): 
        print("{} X {} = {}".format(i, a, i*a))