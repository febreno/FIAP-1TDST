def fibonacci(n):
    if n == 1 or n == 2:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)


def fibo(n):
    ant1 = 1
    ant2 = 1
    while n > 2:
        atual = ant1 + ant2
        ant1 = ant2
        ant2 = atual
        n = n - 1
    return atual

print(fibonacci(50))    
#print(fibo(20))
