class estudante:
    def __init__(self, nome, idade):
        self.nome = nome    
        self.idade = idade

    def texto(self):
        print(f"Meu nome de viado é {self.nome} e minha idade de gay é {self.idade}")

aluno1 = estudante("Emanuel Couto","15")

print(aluno1.nome)
print(aluno1.idade)

aluno1.texto()
