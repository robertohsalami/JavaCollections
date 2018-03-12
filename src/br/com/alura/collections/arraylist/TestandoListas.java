package br.com.alura.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		//aulas.remove(0);
		
		System.out.println(aulas);
		
		for(String aula : aulas) {
			System.out.println(aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));			
		}
		
		//Percorrendo listas usando o Java8
		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		//ordenando a lista
		Collections.sort(aulas);
		System.out.println(aulas);

	}

}
