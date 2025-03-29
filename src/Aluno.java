public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private String matriculaAluno;

    public Aluno(String nome, String matricula, int idade) {
        this.nomeAluno = nome;
        this.matriculaAluno = matricula;
        this.idadeAluno = idade;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    @Override
    public String toString() {
        return "Aluno { " +
                " nome = '" + nomeAluno + '\'' +
                " idade = " + idadeAluno +
                " matricula = ' " + matriculaAluno + '\'' +
                '}';
    }
}
