package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
		
		lista.put(1, new Cargo("DBA", "JR", 5000));
		lista.put(2, new Cargo("DBA", "PL", 8000));
		lista.put(3, new Cargo("DBA", "SR", 12000));
		
		System.out.println("Cargos: " + lista);
		System.out.println("Elemento 2: " + lista.get(2));
		System.out.println("Chaves: " + lista.keySet());
		System.out.println("valores: " + lista.values());
		System.out.println("Qtde: " + lista.size());
		
		for (Cargo objeto : lista.values()) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Salario: " + objeto.getSalario());
		}
		
		
		
		
		
		


		
		
		
		
		
		
		
	}

}
