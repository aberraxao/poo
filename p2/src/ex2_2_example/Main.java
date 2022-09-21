package ex2_2_example;

import java.io.File;

public class Main {

   public static void main(String[] args) {

      // Devemos evitar usar caminhos absolutos

      // File file = new File("/home/diana/Workarea/poo/p2/src/ex2_2_file");

      // Usar caminhos relativos a partir da pasta do projeto
      File file = new File("scr/ex2_2_file/Main.java");
      System.out.println(file.getParentFile().getPath());

   }

}