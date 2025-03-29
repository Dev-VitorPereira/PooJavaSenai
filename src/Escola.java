import javax.swing.*;
import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunosLista;
    private ArrayList<Professor> professoresLista;

    public Escola(String nome) {
        this.nomeEscola = nome;
        this.alunosLista = new ArrayList<>();
        this.professoresLista = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosLista.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professoresLista.add(professor);
    }

    public void listaAlunos() {
        System.out.println("Lista de Alunos: ");
        ;
        for (Aluno aluno : alunosLista) {
            System.out.println(aluno);
            JOptionPane.showMessageDialog(null, "Lista de Alunos: " + aluno);

        }
    }

    public void listaProfessor() {
        System.out.println("Lista de Professores: ");
        for (Professor professor : professoresLista) {
            System.out.println(professor);

            JOptionPane.showMessageDialog(null, "Lista de Professores: " + professor);
        }
    }
}
