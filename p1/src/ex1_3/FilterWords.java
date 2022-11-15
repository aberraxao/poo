package ex1_3;

import java.util.Scanner;

public class FilterWords {
   /*
   Exercício 1.3 - Filtro de palavras
   Desenvolva um programa que recebe como argumentos um conjunto de palavras, as quais serão
   utilizadas para filtrar as frases que o utilizador insira de seguida. O programa deve repetidamente
   pedir frases ao utilizador e de seguida exibir as mesmas filtradas (excluindo todas as palavras
   passadas como argumento ao programa), até que seja dada uma frase vazia.
   */
   static void FilterWords(String exclude, String sentence) {
      String[] filters = exclude.split(" ");
      String[] words = sentence.split(" ");
      String finalSentence = "";
      Boolean match = false;

      for (String word : words) {
         match = false;
         for (String filter : filters)
            if (word.equals(filter)) {
               match = true;
               break;
            }

         if (!match)
            finalSentence = finalSentence + word + " ";
      }

      System.out.println("filtrada: " + finalSentence);
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      String sentence = "start";
      while (!sentence.equals("")) {
         String filter = scanner.nextLine();
         System.out.print("frase: ");
         sentence = scanner.nextLine();
         if (!sentence.equals(""))
            FilterWords(filter, sentence);
      }

      scanner.close();
   }
}
