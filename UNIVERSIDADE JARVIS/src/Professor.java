public class Professor {

    private String nome;

    private Integer idade;

    private String sexo;
    private Integer codigo;
    private String nome_disciplina;

    public Professor(String nome, Integer idade, String sexo, Integer codigo, String nome_disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.codigo = codigo;
        this.nome_disciplina = nome_disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }




}
