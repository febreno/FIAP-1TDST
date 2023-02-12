import random

def leitura(nome):
    arq = open(nome, mode='r')
    lista = []
    for linha in arq:
        lista.append(linha)

    arq.close()
    return lista

def simulando_partidas(grp, grupos, selecoes):
    equipes = grupos[grp]
    i = 0
    while i < len(equipes):
        j = i + 1
        while j < len(equipes):
            gi = random.randint(0, 5)
            gj = random.randint(0, 5)
            print(equipes[i], gi, ' X ', gj, equipes[j])
            atualiza_classificacao(equipes[i], gi, equipes[j], gj, selecoes)
            j = j + 1
        i = i + 1

def atualiza_classificacao(mandante, gM, visitante, gV, selecoes):
    dados_mandante = selecoes[mandante]
    dados_visitante = selecoes.get(visitante)
    if gM > gV:
        dados_mandante[2] = dados_mandante[2] + 1
    elif gV > gM:
        dados_visitante[2] = dados_visitante[2] + 1
    else:
        dados_visitante[3] = dados_visitante[3] + 1
        dados_mandante[3] = dados_mandante[3] + 1

    #saldo de gols
    dados_mandante[4] = dados_mandante[4] + gM - gV
    dados_visitante[4] = dados_visitante[4] + gV - gM

def grava_resultados_copa(selecoes):
    arq = open('resultado.txt', mode='w')
    #arq.write(str(selecoes))
    for nome in selecoes:
        arq.write(str(selecoes[nome]) + '\n')
    arq.close()

def calcula_pontos(time):
    return 3 * time[2] + time[3]


def ordena(selecoes):
    lista = []
    for time in selecoes.values():
        lista.append(time)

    for i in range(1, len(lista)):
        aux = lista[i]
        j = i
        while j > 0 and calcula_pontos(lista[j-1]) < calcula_pontos(aux):
            lista[j] = lista[j-1]
            j = j - 1
        lista[j] = aux

    for i in range(1, len(lista)):
        aux = lista[i]
        j = i
        while j > 0 and lista[j-1][1] > aux[1]:
            lista[j] = lista[j-1]
            j = j - 1
        lista[j] = aux

    return lista    

def finalistas(lista):
    arq = open('finalistas.txt', mode='w')
    i = 0
    while i < len(lista):
        if i % 4 == 0 or i % 4 == 1:
            arq.write(str(lista[i]) + '\n')
        i = i + 1
    arq.close()
    

lista = leitura('selecoes.txt')    
dicionario = {}

for elem in lista:
    elem = elem.replace('\n', '')
    time = elem.split(";")
    time.append(0)
    time.append(0)
    time.append(0)
    nome = time[0]
    dicionario[nome] = time

grupos = {'A': [], 'B': [], 'C': [], 'D': [], 'E': [], 'F': [], 'G': [], 'H': []}

for time in dicionario.values():
    grp = time[1]
    lst = grupos.get(grp)
    lst.append(time[0])

print(grupos)

for grp in 'ABCDEFGH':
    print(grp)
    simulando_partidas(grp, grupos, dicionario)

#print(dicionario)
grava_resultados_copa(dicionario)

lst = ordena(dicionario)
finalistas(lst)