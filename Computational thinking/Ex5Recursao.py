def soma(n):
    if n < 10:
        return n
    else:
        un = n % 10
        return un + soma(n // 10)

print(soma(120810))