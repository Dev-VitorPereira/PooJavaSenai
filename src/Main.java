import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String matricula = JOptionPane.showInputDialog("Digite a matricula:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        Aluno aluno1 = new Aluno(nomeAluno, matricula, idade);

        String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor: ");
        String materia = JOptionPane.showInputDialog("Digite a materia:");
        Professor professor1 = new Professor(nomeProfessor, materia);

        Escola escola1 = new Escola("SENAI");

        Turma turma1 = new Turma("Java Fundamentos",2025,professor1);
        String diciplina = JOptionPane.showInputDialog("Digite o nome da diciplina: ");

        int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaria: "));
        Disciplina diciplina1 = new Disciplina(diciplina, cargaHoraria,professor1);


        escola1.adicionarAluno(aluno1);
        escola1.adicionarProfessor(professor1);
        escola1.listaAlunos();
        escola1.listaProfessor();

        turma1.adicionandoTurma(aluno1);
        turma1.listaTurma();
        diciplina1.statusDiciplina();
    }
}