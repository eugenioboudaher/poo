package escola;

public class Escola {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("brad");
        Aluno a2 = new Aluno("luke");
        Aluno a3 = new Aluno("chad");

        Curso c1 = new Curso("Adm");
        Curso c2 = new Curso("Ing");
        Curso c3 = new Curso("Inf");

        c1.addStudent(a1);
        c1.addStudent(a2);
        c1.addStudent(a3);

        c1.showStudents();
        a1.showCourses();

        while (true) {
            
        }


    }
}
