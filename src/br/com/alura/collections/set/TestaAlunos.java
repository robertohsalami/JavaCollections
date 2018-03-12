package br.com.alura.collections.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Nico Steppat");
		/*alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");*/

		// forEach a partir do Java8
		//alunos.forEach(aluno->System.out.println(aluno));
		
		//foreach normal sem java8
		/*for (String aluno : alunos) {
			System.out.println(aluno);			
		}*/
		
		//Podemos declarar um HashSet da seguinte forma:
		//Collection<String> alunos = new HashSet<>();		
		/*Mas podemos perceber que ainda não podemos utilizar métodos que envolvam a ordem dos elementos. 
		Para isso, podemos utilizar um recurso que utilizamos no capítulo passado, criar uma lista, 
		passando a coleção por parâmetro para o construtor:
		List<String> alunosEmLista = new ArrayList<>(alunos);*/ 
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos);

	}

}
