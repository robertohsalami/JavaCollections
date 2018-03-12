package br.com.alura.collections.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);
        
        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        
        Iterator<Funcionario> it = funcionarios.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next().getNome());
        }
        
        

	}

}
