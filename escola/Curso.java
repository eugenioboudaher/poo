package escola;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    String nome;
    List<Aluno> alunos = new ArrayList<>();

    public Curso (String nome, List<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public Curso (String nome) {
        this.nome = nome;
    }
    

    public void addStudent (Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    public void showStudents () {
        for (Aluno aluno : alunos) {
             System.out.printf("Nome: %s\n", aluno.nome);
        }
        
    }
}
