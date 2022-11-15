package ex2_123;

import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {

    private final String nome;
    private final String sigla;
    private final int capacidade;
    private ArrayList<Inscricao> inscricoes = new ArrayList<>();

    public Disciplina(String nome, String sigla, int capacidade) {
        this.nome = nome;
        this.sigla = sigla;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void inscrever(Aluno aluno) {
        if (inscricoes.size() < capacidade)
            inscricoes.add(new Inscricao(aluno));

        else
            System.err.println("Capacidade excedida em " + sigla + " - " + aluno + " nao foi inscrito");
    }

    private Inscricao procurarInscricao(int numero) {

        for (Inscricao insc : inscricoes)
            if (insc.getAluno().getNumero() == numero) {
                return insc;
            }
        System.err.println("Aluno numero " + numero + " nao está inscrito a " + sigla);
        return null;
    }

    public void desinscrever(int numero) {

        Inscricao aRemover = procurarInscricao(numero);
        inscricoes.remove(aRemover);
    }

    public void lancarNota(int numero, int nota) {

        Inscricao insc = procurarInscricao(numero);
        if (insc != null)
            insc.setNota(nota);
    }

    public boolean temNota(int numero) {

        Inscricao insc = procurarInscricao(numero);
        if (insc != null)
            return insc.temNota();

        return false;
    }

    public int obterNota(int numero) {

        Inscricao insc = procurarInscricao(numero);
        if (insc != null)
            return insc.getNota();

        return Inscricao.NA;
    }

    public float notaMedia() {

        int totalNotas = 0;
        int alunosComNota = 0;

        for (Inscricao insc : inscricoes)
            if (insc.temNota()) {
                totalNotas += insc.getNota();
                alunosComNota++;
            }
        return (float) totalNotas / alunosComNota;
    }

    private int maxNota() {

        int max = Inscricao.NA;
        for (Inscricao insc : inscricoes)
            if (insc.getNota() > max)
                max = insc.getNota();

        return max;
    }

    public ArrayList<Aluno> melhoresAlunos() {

        ArrayList<Aluno> top = new ArrayList<>();
        int maxNota = maxNota();

        if (maxNota == Inscricao.NA)
            return top;

        for (Inscricao insc : inscricoes)
            if (insc.getNota() == maxNota)
                top.add(insc.getAluno());

        return top;
    }


    // o toString serve para listar
    @Override
    public String toString() {

        String str = nome + " (" + sigla + ") - cap: " + capacidade + "\n";

        for (Inscricao insc : inscricoes)
            str += insc + "\n";

        return str;
    }

    // Exerc. 2.3
    public static Disciplina criarDisciplinaComInscricoes(String nome, int capacidade, ArrayList<Aluno> alunos) {

        String sigla = obterSigla(nome);
        Disciplina d = new Disciplina(nome, sigla, capacidade);
        d.inscreverAlunos(alunos);
        return d;

    }

    private void inscreverAlunos(ArrayList<Aluno> alunos) {
        for (Aluno a : alunos)
            inscrever(a);
    }

    private static String obterSigla(String nome) {

        String sigla = "";
        Scanner s = new Scanner(nome);
        while (s.hasNext()) {
            char c = s.next().charAt(0);
            if (c >= 'A' && c <= 'Z')
                sigla += c;
        }
        s.close();
        return sigla;
    }
}

