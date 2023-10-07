class carro:
    pneus = 4 #atributo de classe

    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

carro1 = carro("ford","fiesta")
carro2 = carro("honda","civic")

print(carro1.pneus)
print(carro2.pneus)

print(carro.pneus)