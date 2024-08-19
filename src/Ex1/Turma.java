package Ex1;

public class Turma {

    private String turma;
    private Professor professor;
    private Aluno[] alunos;
    private int posicaoAtual = 0;

    public Turma(String turma, Professor professor, int numeroVagas){
        this.turma = turma;
        this.professor = professor;
        alunos = new Aluno[numeroVagas];
    }

    public String getNome() {
        return turma;
    }

    public void setNome(String turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void inserirAluno(Aluno aluno){
        alunos[posicaoAtual] = aluno;
        posicaoAtual++;
    }

    public void listarAluno(){

        for (int i = 0; i < posicaoAtual; i++){
            System.out.println("Aluno "+ (i+1) +": "+ alunos[i].getNome());
        }
    }


}
