# Leitura dos números e armazenamento na lista
numeros = []
for i in range(5):
    numero = int(input(f"Digite o {i+1}º número inteiro: "))
    numeros.append(numero)

# Soma dos valores da lista
soma = 0
for numero in numeros:
    soma += numero

print(f"A soma dos números é: {soma}")
