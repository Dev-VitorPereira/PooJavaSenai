import javax.swing.*;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
    public void statusDiciplina(){
        System.out.println("Nome Diciplina: " + getNome()+ ", Carga horaria: "+ getCargaHoraria()+ ", Professor: "+ getProfessor());

        JOptionPane.showMessageDialog(null, "Nome Diciplina: " + nome + " Carga Horaria " + cargaHoraria + " Professor: "+ professor.getNomeProfessor() );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
