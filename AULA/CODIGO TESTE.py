class  endereco:
    def __init__(self,rua,cidade):
        self.rua = rua   
        self.cidade = cidade

    def mostrar_endereco(self):
       return f'{self.rua}, {self.cidade}'
        


class pessoa:
    def __init__(self,nome,endereco):
        self.nome = nome
        self.endereco = endereco

    def mostrar_info (self):
        return f'{self.nome} mora em {self.endereco.mostrar_endereco()}'
    
endereco_maria = endereco("Avenida principal", "São Paulo")
maria = pessoa("Maria", endereco_maria)

print(maria.mostrar_info())