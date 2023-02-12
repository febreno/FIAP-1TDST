import time
import random

def separacao(A, p, r):
    pivo = A[r]
    i = p - 1
    for j in range(p, r):
        if A[j] <= pivo:
            i = i + 1
            aux = A[i]
            A[i] = A[j]
            A[j] = aux
    aux = A[r]
    A[r] = A[i+1]
    A[i+1] = aux
    return i+1

def quicksort(A, p, r):
    if p < r:
        q = separacao(A, p, r)
        quicksort(A, p, q - 1)
        quicksort(A, q + 1, r)


def intercala(vetor, p, q, r):
    i = p
    j = q + 1
    aux = []
    while i <= q and j <= r:
        if vetor[i] < vetor[j]:
            aux.append(vetor[i])
            i = i + 1
        else:
            aux.append(vetor[j])
            j = j + 1
    while i <= q:
        aux.append(vetor[i])
        i = i + 1
    while j <= r:
        aux.append(vetor[j])
        j = j + 1

    i = 0    
    while p <= r:
        vetor[p] = aux[i]
        p = p + 1
        i = i + 1


def mergesort(vetor, ini, fim):
    if ini < fim:
        meio = (ini + fim) // 2
        mergesort(vetor, ini, meio)
        mergesort(vetor, meio + 1, fim)
        intercala(vetor, ini, meio, fim)

def cria_lista(n):
    lista = []
    for i in range(n):
        lista.append(random.randint(-10000, 10000))
    return lista

def duplica(lista):
    lst = [] 
    for a in lista:
        lst.append(a)
    return lst

lst1 = cria_lista(600000)
lst2 = duplica(lst1)
lst3 = cria_lista(600000)
lst4 = duplica(lst3)
lst5 = cria_lista(600000)
lst6 = duplica(lst3)


ini = time.time()
quicksort(lst1, 0, len(lst1) - 1)
quicksort(lst3, 0, len(lst3) - 1)
quicksort(lst5, 0, len(lst5) - 1)
fim = time.time()
print("Tempo de ordenação QS de 3 listas de 30000", fim - ini)

ini = time.time()
mergesort(lst2, 0, len(lst2) - 1)
mergesort(lst4, 0, len(lst4) - 1)
mergesort(lst6, 0, len(lst6) - 1)
fim = time.time()
print("Tempo de ordenação MS de 3 listas de 30000", fim - ini)



#lst = [2, -4, 7, -1, 0, 12, 15, 9, 7, 6]
#q = separacao(lst, 0, len(lst) - 1)
#print(q)
#quicksort(lst, 0, len(lst) - 1)
#print(lst)
