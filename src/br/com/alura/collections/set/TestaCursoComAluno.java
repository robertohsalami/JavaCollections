package br.com.alura.collections.set;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.collections.modelo.Aula;
import br.com.alura.collections.modelo.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		// criamos um curso
		Curso javaColecoes = new Curso("Java colecoes", "Paulo Silveira");

		// adicionando aulas no curso
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		// criamos os alunos
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados");
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		Aluno aluno = new Aluno("Douglas Quintanilha", 11824763);
		Aluno alunoQueVeioDoFormulario = new Aluno("Douglas Quintanilha", 11824763);
		
		System.out.println("O aluno e igual ao aluno que veio do formulario?");
		System.out.println(aluno == alunoQueVeioDoFormulario);
		
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		//obrigatoriamente a seguinte condição abaixo é true:
		System.out.println(a1.hashCode() == turini.hashCode());
		
		//Iterator
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
