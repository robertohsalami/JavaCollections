package br.com.alura.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Roberto Salami");
		alunos.add("Priscila Salami");
		alunos.add("Juju");
		alunos.add("Eleni Salami");
		alunos.add("Sergio Salami");
		alunos.add("Farofa");
		alunos.add("Juju");
		
		System.out.println(alunos.size());

	}

}
