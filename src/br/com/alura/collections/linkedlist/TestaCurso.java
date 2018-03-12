package br.com.alura.collections.linkedlist;

import br.com.alura.collections.modelo.Aula;
import br.com.alura.collections.modelo.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		//Repare que uma exception ser� lan�ada ao tentarmos executar javaColecoes.getAulas().add. Qualquer tentativa de modifica��o vai lan�ar essa exception, 
		//indicando algo como "opa! voc� n�o pode alterar o estado dessa cole��o aqui, encontre outra forma de fazer o que voc� quer".
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

		System.out.println(javaColecoes.getAulas());

	}

}
