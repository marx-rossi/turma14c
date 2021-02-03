package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		
		
		List<Cargo> lista = new ArrayList<Cargo>();
		List<Cargo> listajunior = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA", "JR", 5100));
		lista.add(new Cargo("DEV", "PL", 9000));
		lista.add(new Cargo("SUPORTE", "JR", 4500));
		lista.add(new Cargo("ESTAGIARIO", "SR", 3000));
		
		System.out.println(lista);
		
		for (Cargo objeto : lista) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Nível: " + objeto.getNivel());
			System.out.println("Salario: " + objeto.getSalario());
			System.out.println("===================================");
		}
		
		float totalsalario = 0;
		for (Cargo objeto : lista) {
			totalsalario = totalsalario + objeto.getSalario();			
		}
		System.out.println("Salario Total = " + totalsalario);
		
		System.out.println("===================================");
		
		System.out.println("SALÁRIOS MAIORES QUE 5000");
		
		for (Cargo objeto : lista) {
			if (objeto.getSalario()>5000) {
				System.out.println("Cargo: " + objeto.getNome());
				System.out.println("Nível: " + objeto.getNivel());
				System.out.println("Salario: " + objeto.getSalario());
				System.out.println("===================================");
			}			
		}
		
		
		for (Cargo objeto : lista) {
			if (objeto.getNivel().contains("JR")) {
				listajunior.add(new Cargo(objeto.getNome(), objeto.getNivel(), objeto.getSalario()));
				
			}			
		}
		
		System.out.println("Juniores = " + listajunior);
		
		System.out.println("===================================");
		
		Collections.sort(lista);
		System.out.println("LISTA ORDENADA");
		
		for (Cargo objeto : lista) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Nível: " + objeto.getNivel());
			System.out.println("Salario: " + objeto.getSalario());
			System.out.println("===================================");
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
