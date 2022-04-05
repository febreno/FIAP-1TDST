# # 1
print("\nHello World!")

# # 2
name = input("\nwrite your name: ")
print(name)

# #3
name = input("\nwrite your name: ")
birth = int (input("write YEAR at you born: "))
print("You have", 2022 - birth, "years old")

# #4
num1 = int (input("\nwrite your num1: "))
num2 = int (input("write your num2: "))
print(num1, "+", num2, "=", num1 + num2)
print(num1, ".", num2, "=", num1 * num2)
print(num1, "/", num2, "=", num1 / num2)
print(num1, "%", num2, "=", num1 % num2)

# #5
print("\nPOTENCE x²")
num1 = int (input("write your num1: "))
num2 = int (input("write your num2: "))
print(num1, "at", num2, "=", num1 ** num2)

# #6
print("")
pi = float(3.1415926)
print("π ○(area and perimeter)")
d = int (input("\nwrite diameter: "))
r = d / 2
print("P = d.π = ", d * pi)
print("A = π.r² = ", pi * r ** 2)

#7
# %.1f
# "a = {:.2f}".format(num1)
print("")
print("CALC TEN, UNITY")
num1 = input("write an int number 0 - 99: ")

if int(num1) < 10:
    print(num1, " is valid")
    print("ten = 0, unity = " + num1)
elif int(num1) < 100:
    print(num1, " is valid")
    # num1 = int(num1) / 10
    print("ten =", int(num1) // 10, "unity =", int(num1) % 10)
    # print("ten =", num1, "unity =", int(num1) - float(num1))
    # int - float
    
else:
     print(num1, "is invalid")

#7.1
num = (input('Entre com um número de 0 a 9999: '))
n = str(num)

print("\nAnalizando o número {}".format(n)) 
print("\nUnidade: {}"
    "\nDezena: {}"
    "\nCentena: {}"
    "\nMilhar: {}"
    .format(n[3], n[2], n[1], n[0]) 
)

# #7.2
num = int(input('Informe Um Número: '))
u = num // 1 % 10 
d = num // 10 % 10 
c = num // 100 % 10 
m = num // 1000 % 10 
print('Analizando o Número {}'
.format(num)) 
print('Unidade {}:'
'\nDezena {}:'
'\nCentena {}:'
'\nMilhar: {}'
.format(u, d, c, m))

#7.3
getNum = input("write an int number")
num = int(getNum)
rest = num % 2
if rest == 0:
    print(num, "is pair")
else:
    print(num, "is odd")

#8
print("\nCLOTHING POSSIBILITIES")
tshirt = int(input("number of tshirt: "))
trousers = int(input("number of trousers: "))
shoes = int(input("number of shoes: "))
print("the possibilities are: ", tshirt*trousers*shoes)

#9
print("\nDISCOUNT PERCENTAGE")
p = int(input("the product price: "))
d = int(input("the discount: "))
result = -p/100*d + p
print("DICOUNT > price/100 * discount: ", p/100*d)
print("Final price: ", result)

#10
print("\nAVERAGE SPEED: VM=D/T")
d = int(input("number of distance: "))
t = int(input("number of time: "))
print("R:", d*t)

#11
print("\nPAYMENT PERCENTAGE")
print("*Payment1 < Payment2*")
p1 = int(input("Payment1: "))
p2 = int(input("Payment2: "))
calc = (-p1+p2)/p1*100
if calc > 0:
    print("PERCENTAGE UP: ", calc,"%")
else:
    print("PERCENTAGE DOWN: ", calc,"%")

#12
rm = int(input("RM: "))
n1 = rm % 10
nr1 = rm // 10

n2 = rm % 10
nr2 = rm // 10

n3 = rm % 10
nr3 = rm // 10

n4 = rm % 10
nr4 = rm // 10

n5 = rm % 10
nr5 = rm // 10

plus = n1 + n2 + n3 + n4 + n5
print("Plus: ", plus)

#13
print("\n CALC AVERAGE TEST")
print("NAC pesa 2, AM pesa 3, PS pesa 5")
nac = int(input("NAC: "))
am = int(input("AM: "))
ps = int(input("PS: "))
average = (2*nac + 3*am + 5*ps)/10
print("average:", average)

#14
print("\nIPTU cash-20% or installments 10x")
print("You need to pay 5.000, sorry :(")
print("cash or installments?")
choice = int(input("1 = cash  /  2 = installments"))
if choice == 1:
    print("5.000 - 10%: ", (5000*0.5)-5000)
else:
    print("NO DISCONT VALUE")
    print("5.000 in 10x: ", 5000/10,"x10")






