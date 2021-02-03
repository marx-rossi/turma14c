package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		String marca = JOptionPane.showInputDialog("Informe a marca da Televisão"); 
		float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço da televisão"));
		short polegadas = Short.parseShort(JOptionPane.showInputDialog("Informe quantas polegadas e Televisão possui"));
		short voltagem = Short.parseShort(JOptionPane.showInputDialog("Informe a voltagem da televisão"));
		byte estoque = Byte.parseByte(JOptionPane.showInputDialog("Informe a quantidade em estoque"));
		

	}

}
