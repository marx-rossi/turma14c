package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

public class TesteList {
	
	public static void main(String[] args) {
	
	int numeros[] = new int[5];
	
	//Criar pela super classe e instanciar pela sub classe
	List lista = new ArrayList();
	
	lista.add("churros");
	lista.add(true);
	lista.add(15);
	lista.add(15.5);
	lista.add("1");
	
	System.out.println("Original: " + lista);
	System.out.println("Segundo Elemento: " + lista.get(1));
	lista.remove(2);
	System.out.println("Original - remove: " + lista);
	
	//Criar uma string de um único tipo
	
	List<String> listastring = new ArrayList<String>();
	
	listastring.add("churros");
	listastring.add("churros de azeitona");
	listastring.add("churros de fígado");
	listastring.add("churros de leite condensado");
	listastring.add("1");
	
	System.out.println("Original: " + listastring);
	System.out.println("Segundo Elemento: " + listastring.get(1));
	lista.remove(2);
	System.out.println("Original - remove: " + listastring);
	
	for (int indice = 0; indice < listastring.size(); indice++) {
		System.out.println("Opções de churros: " + listastring.get(indice));
	}
	
	int count = 0;
	for (int indice = 0; indice < listastring.size(); indice++) {
		if (listastring.get(indice).contains("churros")) {
		count++;
		}
	}
	
	System.out.println("Total de opções churros: " + count);
	
	
	
	
	
	
	
	}

}
