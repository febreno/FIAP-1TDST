## 1
print("\n > or <")
num1 = int(input("\n type an num:"))
if num1 > 10:
    print(num1, "> 10")
else:
    print(num1, "< 10")

## 2
print("\n > or <")
num1 = int(input("type an num 1: "))
num2 = int(input("type an num 2: "))
if num1 > num2:
    print("num1 > num2")
elif num1 < num2:
    print("num1 < num2")
elif num1 == num2:
    print("num1 < num2")

## 3
print("\nTEAMS")
tname1 = input("type first team name: ")
goals1 = int(input("goals first team: "))
tname2 = input("type second team name: ")
goals2 = int(input("goals second team: "))
print(tname1, goals1, " X ", goals2, tname2)
if goals1 > goals2:
    print(tname1, "is winner")
elif goals1 < goals2:
    print(tname2, "is winner")
elif goals1 == goals2:
    print("tie")

## 4
print("\nWORKER")
print("max is 8h of work")
print("8h+1h = +50% of salary")
workingHours = int(input("how many hours: "))
earnByHour = int(input("how much he earn by hour: "))
workingDays = workingHours/24
averageHours = workingHours/workingDays
if workingDays < 24 and averageHours < 8:
    print("need more than 24 days")
elif workingDays > 24 and averageHours > 8:
    print("Working days: ", workingDays)
    print("50% of", earnByHour, "=", earnByHour*0.5)
    print("Value with +50%: ", earnByHour*0.5 + earnByHour)
    print("8h/d by 1 month(22d): ", ((workingHours*(earnByHour*0.5 + earnByHour))/10)*22)
    print("8h/d by 1 year(250d): ", ((workingHours*(earnByHour*0.5 + earnByHour))/10)*250)
    print("extra hours: ", workingHours - workingHours/8, "h")
else:
    print("Something is wrong!")
    print("workingHours >= 24days ?")

## 4.1
dias_uteis = int(input("Dias úteis: "))
horas_trab = int(input("Horas trabalhadas: "))
valor_hora = float(input("Valor hora: "))

jornada = dias_uteis * 8
salario = horas_trab * valor_hora
hora_extra = 0
if horas_trab > jornada:
    delta = horas_trab - jornada
    hora_extra = delta * valor_hora / 2
    salario = salario + hora_extra

print("Vou receber {:.2f}".format(salario))    
if hora_extra > 0:
    print("Recebi de hora-extra {:.2f}".format(hora_extra))

## 5
print("\nIS 'A' DIVISIBLE BY 'B'?")
a = float(input("A Value: "))
b = float(input("B Value: "))
calc = a/b
if calc % 2 == 0 and calc % 5 == 0 :
    print(calc, "is divisible")
else:
    print(calc, "isn't divisible")

## 7
idade = int(input("Idade: "))

if idade < 5:
    print("Sem categoria!")
elif idade <= 7:
    print("Infantil")
elif idade <= 10:
    print("Juvenil")
elif idade <= 15:
    print("Adolescente")
elif idade <= 30:
    print("Adulto")
else:
    print("Sênior")

## 9
import math

a = float(input("A: "))
b = float(input("B: "))
c = float(input("C: "))

if a != 0:
    delta = b ** 2 - 4 * a * c
    if delta >= 0:
        x1 = (-b + math.sqrt(delta)) / (2 * a)
        x2 = (-b - math.sqrt(delta)) / (2 * a)
        print("x1={}, x2={}".format(x1, x2))
    else:
        print("Delta negativo, não existe raízes reais")
else:
    print("Não é equação de 2º grau")

## 10
preco = float(input("Preço: "))

condicao = int(input("Informe condição de pagto: "))

if condicao == 1:
    print("à vista no dinheiro ou cheque")
    pgto = preco - preco * 0.1
    print("valor à pagar {:.2f}".format(pgto))

elif condicao == 2:
    print("à vista no cartão")
    pgto = preco - preco * 0.05
    print("valor à pagar {:.2f}".format(pgto))
    
elif condicao == 3:
    print("2x sem juros de {:.2f}".format(preco / 2))

else:
    pgto = preco + preco * 0.07;
    print("4x de {:.2f}".format(pgto / 4))    

## 12 13
dia = int(input("Dia: "))
mes = int(input("Mês: "))
ano = int(input("Ano: "))

bissexto = False
if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
    bissexto = True

if dia < 1 or dia > 31 or mes < 1 or mes > 12:
    print("Data inválida")
elif mes == 2 and (dia == 29 and not bissexto or dia > 29):
    print("Data inválida")
elif dia == 31 and mes == 4 or mes == 6 or mes == 9 or mes == 11:
    print("Data inválida")
else:
    print("Data válida!")
