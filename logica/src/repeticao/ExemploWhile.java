package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Insira seu e-mail");
		
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Insire seu email com @:");
			
		}
		
		System.out.println(email);
		
		

	}

}
