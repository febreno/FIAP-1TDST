arq = open('questionario.py', mode='r')
conteudo = arq.readlines()
for linha in conteudo:
    print(linha)
arq.close()    