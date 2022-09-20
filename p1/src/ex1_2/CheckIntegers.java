package ex1_2;

/*
Exercício 1.2 - Conversão String - inteiro
*/

public class CheckIntegers {
   //a)
   //Verificar se uma String corresponde a um inteiro. Para efeitos de simplificação, considere
   //apenas inteiros positivos.

   public static boolean isPositiveInteger(String s) {
      return s.matches("\\d+");
   }

   public static Integer convertToInteger(String s) {
      return Integer.valueOf(s);
   }

   public static Integer countIntegers(String[] s) {
      int countIntegers = 0;

      for (int i = 0; i < s.length; i++)
         if (isPositiveInteger(s[i]))
            countIntegers += 1;
      return countIntegers;
   }

   public static Integer countNotIntegers(String[] s) {
      return (s.length - countIntegers(s));
   }

   public static Integer sumIntegers(String[] s) {
      int sumIntegers = 0;

      for (int i = 0; i < s.length; i++)
         if (isPositiveInteger(s[i]))
            sumIntegers += convertToInteger(s[i]);

      return sumIntegers;
   }

   public static void main(String[] args) {
      System.out.println("Ex1.2 a)");
      String[] argsa = {"diana", "123", "-123", ""};
      for (int i = 0; i < argsa.length; i++)
         System.out.println(argsa[i] + " é inteiro positivo? "
             + CheckIntegers.isPositiveInteger(argsa[i]));

      System.out.println("\nEx1.2 b)");
      String[] argsb = {"20", "3", "4", "a", "b", "11"};
      System.out.println("Encontrei " + CheckIntegers.countIntegers(argsb) + " inteiros");
      System.out.println("Encontrei " + CheckIntegers.countNotIntegers(argsb)
          + " termos " + "não inteiros");
      System.out.println("Somatório dos inteiros: " + CheckIntegers.sumIntegers(argsb));
   }
}
