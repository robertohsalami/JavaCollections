package br.com.alura.collections.modelo;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import br.com.alura.collections.set.Aluno;

public class Curso {

	private String nome;
	private String instrutor;
	// o curso ter� um punhado de aula
	private List<Aula> aulas = new LinkedList<Aula>();
	// o curso tem alunos
	private Set<Aluno> alunos = new HashSet<>();
	//criado para buscar aluno matriculado no curso
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		// devolva uma copia de aulas de tal forma que ela nao possa ser alterada, que
		// ela n�o seja modific�vel
		return Collections.unmodifiableList(aulas);
		// return aulas;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		/*
		 * int tempoTotal = 0; for(Aula aula : aulas) { tempoTotal += aula.getTempo(); }
		 * 
		 * return tempoTotal;
		 */

		// Jeito de calcular o tempo total atrav�s de um novo recurso do Java8
		// Toda cole��o no Java8 tem um metodo Stream
		// Ao invocarmos esse m�todo, n�s pediremos os inteiros porque trabalhamos com o
		// tempo - que � um inteiro. Ele se chamar� mapToInt e
		// passaremos para ele qual campo inteiro queremos (Aula::getTempo). No final,
		// n�s somaremos esses valores chamando o m�todo sum
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.getNome() + " Tempo Total: " + this.getTempoTotal() + ", aulas: " + this.getAulas();
	}

	public void matricula(Aluno aluno) {
		// adiciona no Set de alunos
		this.alunos.add(aluno);
		//cria a rela��o no MAP
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);		
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		//isso seria sem MAP
		/*for (Aluno aluno : alunos) {
			if (aluno.getNumeroMatricula() == numero) {
				return aluno;
			}
		}
		throw new NoSuchElementException("Matricula " + numero + " n�o encontrada");*/
		
		return this.matriculaParaAluno.get(numero);
	}

}
