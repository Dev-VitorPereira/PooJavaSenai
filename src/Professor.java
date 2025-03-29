public class Professor {
    private String nomeProfessor;
    private String materiaProfessor;

    public Professor(String nome, String materiaProfessor) {
        this.nomeProfessor = nome;
        this.materiaProfessor = materiaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getMateriaProfessor() {
        return materiaProfessor;
    }

    public void setMateriaProfessor(String materiaProfessor) {
        this.materiaProfessor = materiaProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome = ' " + nomeProfessor + '\'' +
                " materia = ' " + materiaProfessor + '\'' +
                '}';
    }
}
