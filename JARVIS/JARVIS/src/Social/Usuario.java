package Social;
import java.util.ArrayList;
public class Usuario {
    //Esta classe vai ter que fazer uma postagem
    // Esta classe vai ter relação com a classe Postagem
    // Esta claase pode interagir com postagem e objetos
    private String nome;
    private String email;
    private String senha;
    private String nascimento;
    private ArrayList<Postagem> postagens;


    public Usuario(String nome, String email, String senha, String nascimento, ArrayList<Postagem> postagens) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nascimento = nascimento;
        this.postagens = postagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public void comentar(Comentario comentario){
        
    }
}
