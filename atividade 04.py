def listar_itens(lista):
    print("Itens na lista de compras:")
    for i, item in enumerate(lista, start=1):
        print(f"{i}. {item}")

def main():
    lista_de_compras = []

    while True:
        print("\nMenu:")
        print("1. Adicionar item")
        print("2. Remover item")
        print("3. Editar item")
        print("4. Listar itens")
        print("5. Sair")

        escolha = input("Escolha uma opção: ")

        if escolha == "1":
            item = input("Digite o item a ser adicionado: ")
            lista_de_compras.append(item)
            print(f"{item} foi adicionado à lista.")

        elif escolha == "2":
            listar_itens(lista_de_compras)
            indice = int(input("Digite o número do item a ser removido: ")) - 1
            if 0 <= indice < len(lista_de_compras):
                item_removido = lista_de_compras.pop(indice)
                print(f"{item_removido} foi removido da lista.")
            else:
                print("Índice inválido.")

        elif escolha == "3":
            listar_itens(lista_de_compras)
            indice = int(input("Digite o número do item a ser editado: ")) - 1
            if 0 <= indice < len(lista_de_compras):
                novo_item = input("Digite o novo valor: ")
                lista_de_compras[indice] = novo_item
                print("Item editado com sucesso.")
            else:
                print("Índice inválido.")

        elif escolha == "4":
            listar_itens(lista_de_compras)

        elif escolha == "5":
            print("Saindo do programa.")
            break

        else:
            print("Opção inválida. Escolha novamente.")

if _name_ == "_main_":
    main()
