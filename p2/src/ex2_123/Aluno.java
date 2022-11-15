package ex2_123;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

    private int numero;
    private String nome;

    public Aluno(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return numero + ": " + nome ;
    }

    // Exerc 2.2
    public static ArrayList<Aluno> lerAlunos(String nomeDoFicheiro) {

        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            Scanner s = new Scanner(new File(nomeDoFicheiro));
            while (s.hasNextLine()) {
                int	numero = s.nextInt();
                String nome = s.nextLine().trim();
                alunos.add(new Aluno(numero, nome));
            }
            s.close();

        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro " + nomeDoFicheiro + " nao encontrado");
        }
        return alunos;
    }
}