cardapio = {}

cardapio['sexta'] = ['filé de pescada com purê', 'moqueca de cação', 'penne com camarão']
cardapio['sabado'] = ['feijoada', 'lasanha', 'churrasco']
cardapio['domingo'] = ['espaguete à bolonhesa', 'churrasco', 'sopa']

for chave in cardapio:
    print(chave)

for valor in cardapio.values():
    print(valor) 

print(cardapio)

#select turma,count(*) from alunos group by turma