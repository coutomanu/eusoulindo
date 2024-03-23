import java.util.ArrayList;

public class Disciplina {

    private String nome;

    private Integer cod_disciplina;

    private Integer quantidade;

    private ArrayList<Professor> professores;

    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, Integer cod_disciplina, Integer quantidade, ArrayList<Professor> professores, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.cod_disciplina = cod_disciplina;
        this.quantidade = quantidade;
        this.professores = professores;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCod_disciplina() {
        return cod_disciplina;
    }

    public void setCod_disciplina(Integer cod_disciplina) {
        this.cod_disciplina = cod_disciplina;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void cadastrarAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
            System.out.println("Aluno cadastrado.");
        } else {
            System.out.println("O aluno já está cadastrado.");
        }
    }
}
