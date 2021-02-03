package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	//Se tem letra maiúscula, então é uma classe
	//Classes Wrappers -> São classes que apoiam os tipo primitivos (começam com letra minúscula).
	//int => Integer
	//double => Double
	//boolean => Boolean
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome"); 
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura * altura);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura + " metros.");
		System.out.println("Peso: " + peso + " Kg");
		System.out.println("IMC: " + imc);
		
	}

}
