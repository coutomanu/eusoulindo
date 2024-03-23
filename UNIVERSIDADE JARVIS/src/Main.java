import java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando uma lista de disciplinas
        ArrayList<Disciplina> disciplinas_cc = new ArrayList<>();
        ArrayList<Professor> profsgeral = new ArrayList<>();
        ArrayList<Aluno> alunos_geral = new ArrayList<>();
        ArrayList<Professor> profs_calculo = new ArrayList<>();
        ArrayList<Aluno> alunos_calculo = new ArrayList<>();
        ArrayList<Integer> notas = new ArrayList<>();

        Curso cc = new Curso("Ciência da Computação", 123, disciplinas_cc, profsgeral, alunos_geral);
        Disciplina d1 = new Disciplina("Calculo", 10, 30, profs_calculo, alunos_calculo);
        Professor p1 = new Professor("Pedro", 45, "Masculino", 01, d1.getNome());
        Aluno a1 = new Aluno("Paulo", 19, "Masculino", 800, cc.getNome(), disciplinas_cc, notas);


        cc.cadastrarDisciplina(d1);
        cc.cadastrarDisciplina(d1);

        d1.cadastrarAluno(a1);
        d1.cadastrarAluno(a1);


    }
}