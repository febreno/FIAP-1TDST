def fatorial(n):
    if n == 0:
        return 1
    else:
        return n * fatorial(n-1)

def fat(n):
    valor = 1
    while n > 0:
        valor = valor * n
        n = n - 1
    return valor


print(fat(6))

