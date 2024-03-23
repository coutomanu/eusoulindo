public class Livro {
    private String autor;
    private String titulo;
    private String ISBN;
    private String Editor;
    private Integer Ano;


    public Livro(String autor, String titulo, String ISBN, String Editor ,Integer Ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.Editor = Editor;
        this.Ano = Ano;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void  setAutor(String autor) {
        this.autor = autor;
    }
    public String getISBN(){
        return ISBN;
    }
    public void  setISBN(String isbn) {
        this.ISBN = isbn;
    }
    public String getEditor(){
        return Editor;
    }
    public void  setEditor(String Editor) {
        this.Editor = Editor;
    }
    public Integer getAno(){
        return Ano;
    }
    public void  setAno(Integer Ano) {
        this.Ano = Ano;
    }
}




