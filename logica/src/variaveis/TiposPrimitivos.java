package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		String marca = JOptionPane.showInputDialog("Informe a marca da Televis�o"); 
		float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o pre�o da televis�o"));
		short polegadas = Short.parseShort(JOptionPane.showInputDialog("Informe quantas polegadas e Televis�o possui"));
		short voltagem = Short.parseShort(JOptionPane.showInputDialog("Informe a voltagem da televis�o"));
		byte estoque = Byte.parseByte(JOptionPane.showInputDialog("Informe a quantidade em estoque"));
		

	}

}
