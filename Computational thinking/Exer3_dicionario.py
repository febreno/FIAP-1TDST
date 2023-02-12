from operator import mod
import re

arquivo = open('/home/eduardo/Downloads/pg19033.txt', mode='r')

info = arquivo.readlines()
dic = {}
for lin in info:
    lin = re.sub(r'[^ a-zA-Z0-9\']', ' ', lin).lower()
    palavras = lin.split(" ")
    for p in palavras:
        if p in dic:
            dic[p] = dic[p] + 1
        else:
            dic[p] = 1

for chave in dic:
    print(chave, '=>', dic[chave])

arquivo.close()    