class No:

    def __init__(self, valor) -> None:
        self.info = valor
        self.prox = None

inicio = None
no = No(0)
no.prox = inicio
inicio = no

no = No(1)
no.prox = inicio
inicio = no

no = No(2)
no.prox = inicio
inicio = no

aux = inicio
while aux != None:
    print(aux.info)
    aux = aux.prox

    