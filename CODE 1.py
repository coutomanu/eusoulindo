sair="sair"

numero01 = input("Digite o primeiro número: ")
numero02 = input("Digite o segundo número: ")
operador = input("Digite a conta que deseja fazer (+-x/): ")

numero01_float = 0
numero02_float = 0

numero01_float = float(numero01)
numero02_float = float(numero02)

if operador == "+":
    print(f"{numero01_float} + {numero02_float} = ", numero02_float + numero01_float)

    
if operador == "-":
    print(f"{numero01_float} - {numero02_float} = ", numero01_float - numero02_float) 

if operador == "/":
    print(f"{numero01_float} / {numero02_float} = ", numero01_float / numero02_float) 

if operador == "/":
    print(f"{numero01_float} / {numero02_float} = ", numero01_float / numero02_float)

if operador == "*":
    print(f"{numero01_float} * {numero02_float} = ", numero01_float * numero02_float)