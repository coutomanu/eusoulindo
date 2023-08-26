alunos = {}  # Dicionário para armazenar os alunos e suas notas

# Leitura dos nomes e notas dos alunos
for i in range(3):
    nome = input(f"Digite o nome do {i+1}º aluno: ")
    nota = float(input(f"Digite a nota do {i+1}º aluno: "))
    alunos[nome] = nota

# Cálculo da média das notas
soma_notas = sum(alunos.values())
media = soma_notas / len(alunos)

print(f"Média das notas: {media:.2f}")
