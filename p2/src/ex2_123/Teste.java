package ex2_123;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        // Testa os metodos a desenvolver nos exerc 2.2 e 2.3
        ArrayList<Aluno> alunos = Aluno.lerAlunos("Estudantes.txt");
        Disciplina bd = Disciplina.criarDisciplinaComInscricoes("Bases de Dados", 20, alunos);

        // Testa o lancamento das notas (exerc 2.1)
        bd.lancarNota(1, 15);
        bd.lancarNota(2, 20);
        bd.lancarNota(3, 12);
        bd.lancarNota(7, 20);
        bd.lancarNota(10, 8);

        System.out.println(bd);

        // Testa os melhores alunos (exerc 2.1)
        System.out.println("Melhores alunos a " + bd.getSigla());
        ArrayList<Aluno> melhoresAlunos = bd.melhoresAlunos();
        for (Aluno a : melhoresAlunos)
            System.out.println(a + " - " + bd.obterNota(a.getNumero()));

    }

}