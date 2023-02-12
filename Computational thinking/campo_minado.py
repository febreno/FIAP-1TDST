import random

def marca_numero_vizinho_bomba(campo, lin, col, dim):
    if lin - 1 >= 0 and col - 1 >= 0 and campo[lin-1][col-1] != 9:
        campo[lin-1][col-1] = campo[lin-1][col-1] + 1

    if lin - 1 >= 0 and campo[lin-1][col] != 9:    
        campo[lin-1][col] = campo[lin-1][col] + 1

    if lin - 1 >= 0 and col + 1 < dim and campo[lin-1][col+1] != 9:
        campo[lin-1][col+1] = campo[lin-1][col+1] + 1

    if col + 1 < dim and campo[lin][col+1] != 9:
        campo[lin][col+1] = campo[lin][col+1] + 1

    if lin + 1 < dim and col + 1 < dim and campo[lin+1][col+1] != 9:
        campo[lin+1][col+1] = campo[lin+1][col+1] + 1

    if lin + 1 < dim and campo[lin+1][col] != 9:
        campo[lin+1][col] = campo[lin+1][col] + 1

    if lin + 1 < dim and col - 1 >= 0 and campo[lin+1][col-1] != 9:
        campo[lin+1][col-1] = campo[lin+1][col-1] + 1

    if col - 1 >= 0 and campo[lin][col-1] != 9:
        campo[lin][col-1] = campo[lin][col-1] + 1

def jogada(campo, lin, col, posicoes_abertas):
    if campo[lin][col] == 9:
        print("Explodiu!")
    elif campo[lin][col] != 0:
        #indicar que esta posicao pode ser exibida
        posicoes_abertas.append([lin, col])
    else:
        #deveria abrir toda a região cujos vizinhos são zero
        posicoes_abertas.append([lin, col])

#tamanho do campo minado e a qtd de bombas
dim = 10

#criacao da matriz
campo = []
posicoes_abertas = []

for i in range(dim):
    campo.append([0] * dim)

#colocando as bombas
bombas = 0
while bombas < 10:
    lin = random.randint(0, dim - 1)
    col = random.randint(0, dim - 1)
    if (lin != 0 or col != 0) and campo[lin][col] == 0:
        campo[lin][col] = 9
        bombas = bombas + 1

#numerando os vizinhos das bombas
for i in range(dim):
    for j in range(dim):
        if campo[i][j] == 9:
            marca_numero_vizinho_bomba(campo, i, j, dim)

#imprimindo a matriz
for lin in campo:
    print(lin)

