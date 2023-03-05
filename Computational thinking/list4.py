#1
print("\n CALC JUST PAIRS")
lst = [1,2,3,4,5,6,0]
result = 0
for i in lst:
    if i%2 == 0:
        result+=i
print(result)

#2
print("\n CALC MEDIA")
lst = [1,2,3,4,5,6,0]
result = 0
for i in lst:
    result+=i
print(result/len(lst))

#3
print("\n CALC MEDIA")
lst = [1,2,3,4,5,6,0]
result = 0
contLess5 = 0
contMore5 = 0
for i in lst:
    result+=i
    if i >= 0 and i < 5:
        contLess5+=1
    if i >= 5 and i < 10:
        contMore5+=1
print(result/len(lst))
print(f"less than 5:{contLess5}, more than 5:{contMore5}")

#4
print("\n CONT NEG/POS")
lst = [-1,2,3,4,5,6,0]
negative=0
positive=0
for i in lst:
    if i < 0:
        negative+=1
    else:
        positive+=1
print(f"pos:{positive} negative:{negative}")

#5
print("\n IS MULTIPLE?")
n = 30
regress = n
lst = []
while regress != 0:
    if n%regress == 0:
        lst.append(regress)
    regress-=1
print(lst)

#6

