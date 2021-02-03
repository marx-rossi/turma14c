package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe o nome do produto").toUpperCase(); 
		byte estoque = Byte.parseByte(JOptionPane.showInputDialog("Informe a quatidade em estoque"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do produto"));
		float valor_estoque = valor * estoque;

		if (estoque> 20) {
			System.out.println("O estoque do produto " + nome + " está alto");
		}else
		if (estoque>=10 && estoque<=20) {
			System.out.println("O estoque do produto " + nome + " está médio");
		}else
		if (estoque<10 && estoque>=5) {
			System.out.println("O estoque do produto " + nome + " está baixo");
		}else System.out.println("O estoque do produto " + nome + " está crítico");

		System.out.println("Valor total do estoque: " + valor_estoque);
		System.out.println("Valor total com desconto: " + (valor_estoque*0.9));
		
		
		
		
		
		
	}

}
