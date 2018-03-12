package br.com.alura.collections.linkedlist;

import br.com.alura.collections.modelo.Aula;
import br.com.alura.collections.modelo.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		//Repare que uma exception será lançada ao tentarmos executar javaColecoes.getAulas().add. Qualquer tentativa de modificação vai lançar essa exception, 
		//indicando algo como "opa! você não pode alterar o estado dessa coleção aqui, encontre outra forma de fazer o que você quer".
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

		System.out.println(javaColecoes.getAulas());

	}

}
