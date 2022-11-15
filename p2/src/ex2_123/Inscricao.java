package ex2_123;


public class Inscricao {

    private Aluno aluno;
    private int nota;

    public static final int NA = -1;

    public Inscricao(Aluno aluno) {
        this.aluno = aluno;
        nota = NA;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota < 0 || nota > 20 && nota != NA) {
            System.err.println("Tentativa de atribuicao de nota ilegal ao aluno " + aluno);
            return;
        }

        this.nota = nota;
    }

    public boolean temNota() {
        return nota != NA;
    }

    @Override
    public String toString() {
        return aluno + " - " + (nota == NA ? "NA" : nota + " val.");
    }
}