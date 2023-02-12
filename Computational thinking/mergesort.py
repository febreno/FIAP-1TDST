import random

def organiza(vetor, pos):
    aux = vetor[pos]
    while pos > 0 and vetor[pos-1] > aux:
        vetor[pos] = vetor[pos-1]
        pos = pos - 1
    vetor[pos] = aux

def insertion_sort(vetor):
    for i in range(1, len(vetor)):
        organiza(vetor, i)    


def mergesort(vetor, p, r):
    if p < r:
        meio = (p + r) // 2
        mergesort(vetor, p, meio)
        mergesort(vetor, meio + 1, r)
        intercala(vetor, p, meio, r)

def intercala(vetor, p, q, r):
    aux = []
    i = p
    j = q + 1
    while i <= q and j <= r:
        if vetor[i] < vetor[j]:
            aux.append(vetor[i])
            i = i + 1
        else:
            aux.append(vetor[j])
            j = j + 1

    while j <= r:
        aux.append(vetor[j])
        j = j + 1
    
    while i <= q:
        aux.append(vetor[i])
        i = i + 1

    for valor in aux:
        vetor[p] = valor
        p = p + 1
 

#lista = [-5, 7, 9, 13, 14, 2, 3, 18, 20, 41]
#intercala(lista, 0, 4, 9)
#print(lista) #aqui aparece a lista ordenada

def geraLista(n):
    lst = [0] * n
    for i in range(n):
        lst[i] = random.randint(1, 1000000)
    return lst

lst = geraLista(100000)
#insertion_sort(lst)
#print(lst)

mergesort(lst, 0, len(lst) - 1)
#print(lst)

