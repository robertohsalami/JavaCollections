package br.com.alura.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.collections.modelo.Aula;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de lista e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);		
				
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		//Outra maneira de ordenar utilizando os recursos do Java8
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		//ou
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}
