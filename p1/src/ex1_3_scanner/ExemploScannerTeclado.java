package ex1_3_scanner;

import java.util.Scanner;

public class ExemploScannerTeclado {

   /*
   As bibliotecas do Java fornecem a classe java.util.Scanner para processamento de texto,
   podendo este ter diferentes proveniências. No caso mais simples, um objeto Scanner pode ser
   usado para processar uma String, iterando sobre o seu conteúdo palavra a palavra (token).
   */
   static void ex1() {
      Scanner scanner = new Scanner("uma frase de exemplo");
      while (scanner.hasNext()) {
         String token = scanner.next();
         System.out.println(token);
      }
      scanner.close();
   }

   /*
   A classe Scanner também pode ser utilizada para ler strings do teclado, sendo que neste caso
   o processamento é feito linha a linha. O código seguinte lê sucessivamente linhas do teclado,
   bloqueando a cada nextLine(), até que seja escrito "fim" (a guarda do ciclo falha).
   */
   static void ex2() {
      Scanner scanner = new Scanner(System.in);
      String line = "";
      while (!line.equals("fim")) {
         line = scanner.nextLine(); // bloqueia ate ser dado enter
         System.out.println("linha: " + line);
      }
      scanner.close();
   }

   public static void main(String[] args) {
      ex1();
      ex2();
   }
}
