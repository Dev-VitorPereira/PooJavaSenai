import javax.swing.*;
import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoLetivo;
    private Professor professor;
    private ArrayList<Aluno>alunos;

    public Turma(String nomeTurma, int anoLetivo, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    public void adicionandoTurma(Aluno aluno){
        alunos.add(aluno);
    }

    public void listaTurma(){
        System.out.println("Lista de da Turma: ");

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            JOptionPane.showMessageDialog(null, "Lista da Turma: " + aluno);

        }
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}
