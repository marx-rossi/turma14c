package br.com.concessionaria.modelo;

import javax.swing.JOptionPane;

import br.com.brconcessionario.teste.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		//Instanciando um objeto
		
		Veiculo objeto = new Veiculo();
		//objeto.modelo = "UNO"; //O acesso não está liberado pois "modelo" é privado
		objeto.preencherModelo(JOptionPane.showInputDialog("Preencher modelo"));
		System.out.println(objeto.retornarModelo());
		objeto.preencherPlaca("dnk5526");
		objeto.preencherStatus("sIm");
		objeto.preencherValor(5000);
		objeto.preencherVelocidadeAtual(500);
		
		
		System.out.println(objeto.retornarModelo());
		System.out.println(objeto.retornarPlaca());
		System.out.println(objeto.retornarStatus());
		System.out.println(objeto.retornarValor());
		System.out.println(objeto.retornarVelocidadeAtual());

		
		System.out.println("Valor com desconto: " + objeto.retornarDesconto());
		
		objeto.aplicarReajuste(10);
		System.out.println("Valor com reajuste: " + objeto.retornarValor());
		
		
		objeto.acelerar(50);
		System.out.println("Velocidade acelerada " + objeto.retornarVelocidadeAtual());
		
		objeto.brecar();
		System.out.println("Velocidade após brecar " + objeto.retornarVelocidadeAtual());
		
		System.out.println("Desligar " + objeto.desligar());
		
		System.out.println("Ligar " + objeto.ligar());
		
		System.out.println("Resumo " + objeto.retornarResumo());
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
