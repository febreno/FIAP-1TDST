cedula = int(input("Valor da cédula: "))
moeda1 = int(input("Primeira moeda: "))
moeda2 = int(input("Segunda moeda: "))

q2 = 0
saldo = cedula - q2 * moeda2
while  saldo >= 0 and saldo % moeda1 != 0:
    q2 = q2 + 1
    saldo = cedula - q2 * moeda2

if saldo < 0:
    print("Não é possivel fazer troca!")
else:
    q1 = saldo // moeda1
    print("QTD: ", q1, " ", q2)