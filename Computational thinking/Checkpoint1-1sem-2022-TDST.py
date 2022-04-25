# 1
print("\nYEARS AND MONTHS (INT)")
y = int(input("Years: "))
m = float(input("Months: "))
t = float(input("More months: "))
m = m*0.10

if t <= 11:
    t = t*0.101
    print("1 year < 11 months")
    print(y+m, "+","{: .1f}".format(t), "=","{: .1f}".format(y+m+t), "year(s)")
elif t > 11:
    t = float(t/11)
    print("1 year >= 12 months")
    print(y+m, "+","{: .1f}".format(t), "=","{: .1f}".format(y+m+t), "year(s)")

# 2
print("\nENERGY CONSUMPTION")
spent = float(input("Energy spent(kWh): "))
pay = float(14)
if spent <= 50:
    print("finalvalue: ", pay)
elif spent > 50 and spent < 99:
    pay = pay + spent*0.25
    print("finalvalue: ", pay)
elif spent >= 100 and spent <= 200:
    pay = pay + spent*0.25 + (pay + (spent*0.25))*0.13
    print("finalvalue: ", pay)
elif spent > 200:
    pay = pay + (spent*0.25) + (pay + (spent*0.25))*0.33
    print("finalvalue: ", pay)

# 3
print("\nWATER CHARGE")
wc = float(input("Water consumption: "))
lastconsumption = int(input("Last consumption: "))
finalvalue = float(0)

if wc <= 20:
    finalvalue = wc*2
    print("final value:", "R$", finalvalue)
elif wc > 20 and wc <= 35:
    finalvalue = wc*3.50
    print("final value: ", "R$", finalvalue)
elif wc > 35 and wc <= 50:
    finalvalue = wc*3.50
    print("final value: ", "R$",finalvalue)
elif wc >= 51:
    finalvalue = wc*7.00
    print("final value: ", "R$",finalvalue)

if wc < lastconsumption:
    finalvalue = finalvalue - (finalvalue*0.2)
    print("final value: ", "R$",finalvalue)
elif wc > lastconsumption + (lastconsumption*0.10):
    finalvalue = finalvalue + (finalvalue*0.3)
    print("final value: ", "R$",finalvalue)