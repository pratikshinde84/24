import os

print(os.getcwd())
import math,random
lst=[1,2,3,4,5]
start,end=0,len(lst)-1
while start<end:
    lst[start],lst[end]=lst[end],lst[start]
    start=start+1
    end-=1
print(lst)

cards = [1, 2, 3, 4]
 
random.shuffle(cards)
print(math.gcd(12,14))

print(cards)