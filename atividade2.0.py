peso = float(input("Insira seu peso em kg: "))
altura = float(input("Insira sua altura em metros: "))


imc = peso / (altura ** 2)



print(f"Seu IMC é: {imc:.2f}")

if imc < 18.5:
    print("Você está abaixo do peso.")
elif imc < 24.9:
    print("Seu peso está dentro da faixa saudável.")
elif imc < 29.9:
    print("Você está sobrepeso.")
else:
    print("Você está em obesidade.")
