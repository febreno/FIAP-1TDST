#enquanto haCasasEmBranco(matriz):
#    pega uma casa em branco
#    resp = tentaColocarNumero(matriz, casa, num)
#    if resp == True:
#       guarda na pilha essa casa 
#       e vai para a proxima
#    else:
#       volta para casa anterior
#       limpa o numero do jogo do sudoku
#       tenta colocar outro numero nessa casa    
    

matriz = []
matriz.append([3, 0, 6, 5, 0, 8, 4, 0, 0])
matriz.append([5, 2, 0, 0, 0, 0, 0, 0, 0])
matriz.append([0, 8, 7, 0, 0, 0, 0, 3, 1])
matriz.append([0, 0, 3, 0, 1, 0, 0, 8, 0])
matriz.append([9, 0, 0, 8, 6, 3, 0, 0, 5])
matriz.append([0, 5, 0, 0, 9, 0, 6, 0, 0])
matriz.append([1, 3, 0, 0, 0, 0, 2, 5, 0])
matriz.append([0, 0, 0, 0, 0, 0, 0, 7, 4])
matriz.append([0, 0, 5, 2, 0, 6, 3, 0, 0])    