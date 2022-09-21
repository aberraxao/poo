package ex2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {

   private String nome;
   private int numero;

   public Aluno(String name, int number) {
      this.nome = name;
      this.numero = number;
   }

   public String getName() {
      return nome;
   }

   public int getNumber() {
      return numero;
   }

   @Override
   public String toString() {
      return numero + ": " + nome;
   }

   public static ArrayList<Aluno> leAlunos(String localizacao) {

      ArrayList<Aluno> alunos = new ArrayList<>();

      try {
         Scanner scanner = new Scanner(new File(localizacao));

         // Ainda exsitem linhas por ler?
         while (scanner.hasNextLine()) {
            /*
            int numero = scanner.nextInt();
            // nextLine n├úo est├í a ler a linha toda pq j├í li o int
            String nome = scanner.nextLine();
            nome.trim();

            Aluno aluno = new Aluno(nome, numero);
            alunos.add(aluno);
             */

            String line = scanner.nextLine();
            int index = line.indexOf(" ");
            String numeroString = line.substring(0, index);
            int numero = Integer.parseInt(numeroString);
            String nome = line.substring(index + 1);

            Aluno aluno = new Aluno(nome, numero);
            alunos.add(aluno);
         }

         scanner.close();

      } catch (FileNotFoundException e) {
         // Eclipse adds e.printStackTrace();
         throw new RuntimeException(e);
      }

      return alunos;

   }
}

