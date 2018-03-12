package br.com.alura.collections.modelo;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}
	
	//Aqui decide-se o crit�rio de compara��o. Vou optar por ordem alfabetica aproveitando o metodo compareTo da classe String
	@Override
	public int compareTo(Aula outraAula) {		
		return this.titulo.compareTo(outraAula.titulo);
	}

}
