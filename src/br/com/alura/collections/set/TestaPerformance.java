package br.com.alura.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * No caso do ArrayList, a inser��o � bem r�pida e a busca muito lenta!
   No caso do HashSet, a inser��o ainda � r�pida, embora um pouco mais lenta do que a das listas. 
   Mas a busca � muito r�pida!
 * @author roberto.salami
 *
 */
public class TestaPerformance {

	public static void main(String[] args) {
		//Collection<Integer> numeros = new ArrayList<Integer>();
		Collection<Integer> numeros = new HashSet<Integer>();

		long inicio = System.currentTimeMillis();

		for (int i = 0; i <= 100000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempoDeExecucao);

	}

}
