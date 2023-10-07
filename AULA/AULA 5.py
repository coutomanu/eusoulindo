class livro:
    def __init__(self,titulo,autor,ano):
        self.titulo = titulo
        self.autor = autor
        self.ano = ano
    
    def texto(self):
        print(f"O titulo do livro é {self.titulo}, o autor do livro é {self.autor}, o ano da publicação é {self.ano}.")

titulo = input (str("Qual o titulo do livro?: "))
autor = input (str("Qual o autor do livro?: "))
ano = input (str("Qual o ano da publicação?: "))

livro1 = livro(titulo, autor, ano)
livro1.texto()