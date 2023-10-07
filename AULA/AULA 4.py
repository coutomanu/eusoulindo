class estudante:
    def __init__(self, nome, idade):
        self.nome = nome    
        self.idade = idade

    def texto(self):
        print(f"Meu nome de viado é {self.nome} e minha idade de gay é {self.idade}")

nome = input(str("Digite seu nome: "))
idade = input (str("Digite sua idade: "))

aluno1 = estudante(nome, idade)
aluno1.texto()
