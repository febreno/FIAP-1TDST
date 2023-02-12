def criaTabuleiro():
    mat = []
    for i in range(3):
        mat.append(['_'] * 3)
    return mat

def trocaJogador(jog):
    if jog == 'X':
        return 'O'
    else:
        return 'X'

def temEspaco(mat):
    for i in range(3):
        for j in range(3):
            if mat[i][j] == '_':
                return True
    return False

def haGanhador(mat):
    for x in range(3):
        if mat[x][0] == mat[x][1] and mat[x][1] == mat[x][2] and mat[x][0] != '_':
            return True
        if mat[0][x] == mat[1][x] and mat[1][x] == mat[2][x] and mat[0][x] != '_':
            return True
    
    if mat[0][0] == mat[1][1] and mat[1][1] == mat[2][2] and mat[0][0] != '_':
        return True
    if mat[0][2] == mat[1][1] and mat[1][1] == mat[2][0] and mat[0][2] != '_':
        return True

    return False    
        

def joga(mat, lin, col, jog):
    if lin < 0 or lin > 2 or col < 0 or col > 2:
        return False
    if mat[lin][col] != '_':
        return False

    mat[lin][col] = jog
    return True    


def imprime(mat):
    for lin in mat:
        print(lin)
