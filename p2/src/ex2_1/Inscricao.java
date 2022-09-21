package ex2_1;

public class Inscricao {

   public static final int NA = -1;

   private int nota = NA;
   private Aluno aluno;

   public Inscricao(Aluno aluno) {
      this.aluno = aluno;
   }

   public boolean temNota() {
      return nota != NA;
   }

   public int getNota() {
      return nota;
   }

   public void setNota(int nota) {
      if (nota >= 0 && nota <= 20)
         this.nota = nota;
   }

   public Aluno getAluno() {
      return aluno;
   }

   @Override
   public String toString() {
      return aluno + " -> " + (nota == NA ? "NA" : nota);
   }
}

