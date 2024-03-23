import java.util.ArrayList;

public class Aluno {
    private String nome;

    private Integer idade;

    private String sexo;
    private Integer num_matricula;

    private String curso;

    private ArrayList<Disciplina> disciplinas;

    private ArrayList<Integer> notas;

    public Aluno(String nome, Integer idade, String sexo, Integer num_matricula, String curso, ArrayList<Disciplina> disciplinas, ArrayList<Integer> notas) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.num_matricula = num_matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
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

    public Integer getNum_matricula() {
        return num_matricula;
    }

    public void setNum_matricula(Integer num_matricula) {
        this.num_matricula = num_matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }


}
