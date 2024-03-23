
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        biblioteca.adicionarLivro(new Livro("Miguel de Cervantes", "Don Quixote", "978-3-16-148410-0", "Francisco de Robles", 1607));
        biblioteca.adicionarLivro(new Livro("J.K. Rowling", "Harry Potter", "978-3-16-148411-0", "Bloomsbury Publishing Rocco Presença", 1997));


        biblioteca.listarLivros();
    }
}

