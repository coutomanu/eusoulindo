import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
         //Criando objeto da classe Teacher.
         Teacher teacher1 = new Teacher("Fernando", 35, "Computer Science");

        //Criando listas
        List<Student> enrolledStudents = new ArrayList<>();
        List <Subject> offeredSubjects = new ArrayList<>();
        List<Subject> taughSubjects = new ArrayList<>();
        List<Course> enrolledCourses = new ArrayList<>();
        List<Double> grades = new ArrayList<>();

        // Criando objetos da classe Subject;
        Subject javaPrograming = new Subject("Java Programing", "JV01", 80, teacher1, enrolledStudents);
        offeredSubjects.add(javaPrograming);
        Subject databaseManagement = new Subject("Database Management", "DB01", 35, teacher1, enrolledStudents);
        offeredSubjects.add(databaseManagement);

        // Adicionando disciplinas a lista de disciplinas oferecidas;
        taughSubjects.add(databaseManagement);
        taughSubjects.add(javaPrograming);

        //Criando uma lista de estudantes matriculados
        Student newstudent1 = new Student("Owayran", 25, "154422", enrolledCourses, offeredSubjects, grades);
        enrolledStudents.add(newstudent1);
        Student newstudent2 = new Student("Maria", 23, "154423", enrolledCourses, offeredSubjects, grades);
        enrolledStudents.add(newstudent2);

        //Criando objeto da classe Course.
        Course course1 = new Course("Computer Science", 40, offeredSubjects, enrolledStudents);

        //Exibindo infos (teste)
        for (Subject subject : taughSubjects) {
            // nome da disciplina e prof responsavel (testando)
            String subjectName = subject.getName();
            String teacherName = subject.getResponsibleTeacher().getName();
        
            // Informações da disciplina profesor responsavel (testando)
            System.out.println("Subject: " + subjectName);
            System.out.println("Responsible Teacheer: " + teacherName);
            System.out.println("--------------------------------------");
        }
        System.out.println("Name: " + course1.getName());
        System.out.println("Duration: " + course1.getDuration() + " hours");
        System.out.println("Offered Subjects:");
        for (Subject subject : course1.getOfferedSubjects()) {
            System.out.println("- " + subject.getName() + " (" + subject.getCode() + ")");
        }
        System.out.println("Enrolled Students:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println("- " + student.getName() + " (Registration Number: " + student.getRegistrationNumber() + ")");
        }

        //Atribuindo nota ao Aluno 1
        double grade = 8.5;
        Subject subject = javaPrograming;
        Student student = newstudent1;
        subject.assignGrade(student, grade);

        //Atribuido nota ao Aluno 2
        double grade1 = 9.2;
        Subject subject1 = databaseManagement;
        Student student1 = newstudent2;
        subject1.assignGrade(student1, grade1);

        // Exemplo de saida das informações
        System.out.println("--------------------------------------");
        System.out.println("Grade given to " + student.getName() + " in subject " + subject.getName() + ": " + grade);
        System.out.println("Grade given to " + student1.getName() + " in subject " + subject1.getName() + ": "+ grade1);

        //Também para exibir infos do objeto da class Teacher, ainda está com erro, preciso consertar
        System.out.println(teacher1);
    }
    
}
