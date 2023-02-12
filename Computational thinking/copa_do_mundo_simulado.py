import random

def atualiza_resultado(times, timeA, golsA, timeB, golsB):
    pass

selecoes = {}

selecoes['Catar'] = ['Catar', 'A', 0, 0, 0]
selecoes['Senegal'] = ['Senegal', 'A', 0, 0, 0]
selecoes['Equador'] = ['Equador', 'A', 0, 0, 0]
selecoes['Holanda'] = ['Holanda', 'A', 0, 0, 0]

grupoB = ['Inglaterra', 'Irã', 'Estados Unidos', 'País de Gales']

grupos = {}
grupos['B'] = grupoB

for pais in grupoB:
    selecoes[pais] = [pais, 'B', 0, 0, 0]

for i in range(len(grupoB)):
    for j in range(i + 1, len(grupoB)):
        golsI = random.randint(0, 3)
        golsJ = random.randint(0, 3)
        print(grupoB[i], golsI, "X", golsJ, grupoB[j])
        atualiza_resultado(selecoes, grupoB[i], golsI, grupoB[j], golsJ)


#print(selecoes)
