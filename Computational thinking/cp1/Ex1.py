aulas_semanais = int(input("Qtd de aulas semanais: "))
hora_aula = float(input('Valor da hora aula: '))

salario_base = aulas_semanais * 4.5 * hora_aula
hora_atividade = salario_base * 5 / 100
dsr = (salario_base + hora_atividade) / 6
salario_mensal = salario_base + hora_atividade + dsr

print("Salário base: {:.2f}".format(salario_base))
print("Hora atividade: {:.2f}".format(hora_atividade))
print("DSR: {:.2f}".format(dsr))
print("Salário mensal: {:.2f}".format(salario_mensal))