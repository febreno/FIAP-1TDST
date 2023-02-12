anos = int(input("Informe a qtd de anos do tempo: "))
meses = int(input("Informe a qtd de meses do tempo: "))
t = int(input("Informe o valor de t: "))

tempo_meses = anos * 12 + meses + t

novo_anos = tempo_meses // 12
novo_meses = tempo_meses % 12

print("O tempo é de anos: {} meses: {}.".format(novo_anos, novo_meses))
