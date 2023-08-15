sair = "sair"


nome = input("Digite o seu nome ")
sobrenome = input("Digite o seu sobrenome ")
idade = int(input("Digite a sua idade "))
altura = float(input("Digite sua altura "))
peso = float(input("Digite o seu peso "))

maior_idade = idade >= 18


print("\n Resultado")
print("nome", nome)
print("sobrenome",sobrenome)
print("idade",idade,"y")
print("altura",altura,"cm")
print("peso",peso,"kg")
print("Maior de idade", "Sim" if maior_idade else "não")