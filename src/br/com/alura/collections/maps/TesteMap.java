package br.com.alura.collections.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		
		// Em MAP temos:
		//uma cole��o de chaves, uma cole��o de valores, e uma cole��o das associa��es. 
		//O interessante � que podemos acessar cada uma das cole��es. 
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		//Para acessar as chaves devemos executar
		Set<String> chaves = nomesParaIdade.keySet();
		for (String nome : chaves) {
			System.out.println(nome);
		}
		
		//E para pegar os valores usamos
		Collection<Integer> valores = nomesParaIdade.values();
		for (Integer idade : valores) {
			System.out.println(idade);
		}
		
		//Agora s� falta a terceira cole��o que devolve a associa��o - entrySet()
		//e cada associa��o � representado atrav�s da classe Entry:
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		

	}

}
