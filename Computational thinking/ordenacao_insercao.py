def organiza(lista, pos):
    aux = lista[pos]

    while pos > 0 and lista[pos - 1] > aux:
        lista[pos] = lista[pos - 1]
        pos = pos - 1

    lista[pos] = aux

def selection_sort(lista):
    for i in range(1, len(lista)):
        organiza(lista, i)


l = [44, 30, 18, 15, 6, 19, 8, -1]
selection_sort(l)
print(l)
