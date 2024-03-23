import java.util.ArrayList;

public class Curso {
    private String nome;

    private Integer codigo;

    private ArrayList<Disciplina> disciplinas;

    private ArrayList<Professor> professores;

    private ArrayList<Aluno> alunos;

    public Curso(String nome, Integer codigo, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
        this.professores = professores;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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

    public void cadastrarDisciplina(Disciplina disciplina) {
        if (!this.disciplinas.contains(disciplina)) {
            this.disciplinas.add(disciplina);
            System.out.println("Disciplina cadastrada com sucesso no curso.");
        } else {
            System.out.println("A disciplina já está cadastrada no curso.");
        }
    }
}
