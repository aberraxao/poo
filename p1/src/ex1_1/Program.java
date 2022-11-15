package ex1_1;

/*
Exercício 1.1 - Argumentos de programa
Escreva um programa que liste os argumentos passados ao mesmo. Para imprimir valores
para a consola invoque System.out.println(...).
*/
public class Program {
   public static void main(String[] args) {
      for (int i = 0; i < args.length; i++)
         System.out.println(args[i]);
   }
}
