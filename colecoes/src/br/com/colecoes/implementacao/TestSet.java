package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set<String> listastring = new HashSet<String>();
		
		listastring.add("churros");
		listastring.add("churros de azeitona");
		listastring.add("churros de f�gado");
		listastring.add("churros de leite condensado");
		listastring.add("churros de leite condensado");
		listastring.add("1");
		
		System.out.println("Original: " + listastring);
		System.out.println(listastring.contains("churros"));
		
		//Foreach
		
		for (String opcoes : listastring) {
			System.out.println("Op��es de churros: " + opcoes);
		}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
