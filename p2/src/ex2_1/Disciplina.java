package ex2_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Disciplina {

   private String nome;
   private String sigla;
   private int cap;
   private ArrayList<Inscricao> inscricoes = new ArrayList<>();

   public Disciplina(String nome, String sigla, int cap) {
      this.nome = nome;
      this.sigla = sigla;
      this.cap = cap;
   }

   public void escreverNoFIcheiro(String localizacao) {

      try {
         PrintWriter pw = new PrintWriter(localizacao);

         pw.println(nome);
         pw.println(cap);

         /* Opção 1
         for (int i = 0; i < inscricoes.size(); i++) {
            Inscricao inscricao = inscricoes.get(i);
            int nota = inscricao.getNota();
            int numero = inscricao.getAluno().getNumber();

            pw.println(numero + (inscricao.temNota() ? "" + nota : "NA"));
         }

         pw.close();
         */

         for (Inscricao inscricao : inscricoes) {
            int nota = inscricao.getNota();
            int numero = inscricao.getAluno().getNumber();

            pw.println(numero + (inscricao.temNota() ? "" + nota : "NA"));
         }

         pw.close();

      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      }

   }

   public void inscrever(Aluno aluno) {

      if (inscricoes.size() < cap) {
         Inscricao insc = new Inscricao(aluno);
         inscricoes.add(insc);
      }
   }

   public void desinscrever(int numero) {

      Inscricao insc = procurarInscricao(numero);
      inscricoes.remove(insc);
   }

   private Inscricao procurarInscricao(int numero) {

      // Não posso remover a inscrição dentro do for sem um break, porque pode
      // ocorrer o erro "java.util.CurrentModificationException"
      for (Inscricao insc : inscricoes)
         if (insc.getAluno().getNumber() == numero)
            return insc;

      return null;
   }

   @Override
   public String toString() {

      String aux = nome + "\n";

      for (Inscricao insc : inscricoes)
         aux += insc + "\n";

      return aux;
   }

}
