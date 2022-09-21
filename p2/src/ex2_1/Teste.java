package ex2_1;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		Aluno a = new Aluno("Zé", 1);
		System.out.println(a.toString());
		
		Disciplina poo = new Disciplina("Programacao Orientada para Objetos", "POO", 300);

		poo.inscrever(new Aluno("Zé", 1));
		poo.inscrever(new Aluno("Ana", 2));
		poo.inscrever(new Aluno("Rui", 3));
		poo.inscrever(new Aluno("Inês", 4));

		poo.desinscrever(2);

		System.out.println(poo);

		poo.escreverNoFIcheiro("poo.txt");
	}	

}

