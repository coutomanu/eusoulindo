import tkinter as tk
from tkinter import messagebox

def exibir_mensagem():
    nome = nome_entry.get()  
    mensagem = mensagem_entry.get("1.0", "end-1c")  

    
    nova_janela = tk.Toplevel(root)
    nova_janela.title("Mensagem do Usuário")

    
    tk.Label(nova_janela, text=f"Nome: {nome}").pack()
    tk.Label(nova_janela, text=f"Mensagem: {mensagem}").pack()


root = tk.Tk()
root.title("Janela por Emanuel Couto")


nome_label = tk.Label(root, text="Seu Nome:")
nome_label.pack()
nome_entry = tk.Entry(root)
nome_entry.pack()

mensagem_label = tk.Label(root, text="Sua Mensagem:")
mensagem_label.pack()
mensagem_entry = tk.Text(root, height=5, width=30)
mensagem_entry.pack()


enviar_button = tk.Button(root, text="ENVIAR", command=exibir_mensagem)
enviar_button.pack()


root.mainloop()

import tkinter as tk
from tkinter import messagebox

def exibir_mensagem():
    nome = nome_entry.get()
    mensagem = mensagem_entry.get("1.0", "end-1c")
    nova_janela = tk.Toplevel(root)
    nova_janela.title("Mensagem do Usuário")
    tk.Label(nova_janela, text=f"Nome: {nome}").pack()
    tk.Label(nova_janela, text=f"Mensagem: {mensagem}").pack()

def fechar_janela():
    resposta = messagebox.askyesno("Fechar", "Quer realmente fechar?", icon=messagebox.WARNING)
    if resposta:
        root.destroy()

root = tk.Tk()
root.title("Formulário de Mensagem")

nome_label = tk.Label(root, text="Nome:")
nome_label.pack()
nome_entry = tk.Entry(root)
nome_entry.pack()

mensagem_label = tk.Label(root, text="Mensagem:")
mensagem_label.pack()
mensagem_entry = tk.Text(root, height=5, width=30)
mensagem_entry.pack()

enviar_button = tk.Button(root, text="Enviar", command=exibir_mensagem)
enviar_button.pack()


root.protocol("WM_DELETE_WINDOW", fechar_janela)

root.mainloop()


#Autoria de Emanuel Couto
#PARA MELHOR EXPERIENCIA ABRA A JANELA INTEIRA