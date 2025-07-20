package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    final List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void addCourse(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public void showCourses() {
        for (Curso curso : cursos) {
            System.out.printf("Nome: %s\n", curso.nome);
        }

    }

    public boolean findCourse(String curso) {
        for (Curso c : cursos) {
            if (c.nome.equalsIgnoreCase(curso)) {
                return true;
            }
        }
        return false; // Se não encontrar
    }

}
