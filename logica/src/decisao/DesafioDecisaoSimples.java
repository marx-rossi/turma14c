package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe o seu nome").toUpperCase(); 
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a sua idade"));

		if (idade< 16) {
			System.out.println(nome + ", voc� n�o est� autorizado � votar");
		}else
		if (idade>=16 && idade<18 || idade>=70) {
			System.out.println(nome + " o seu voto � facultativo");
		}else
		if (idade>=18 && idade<70) {
			System.out.println(nome + " o seu voto � obrigat�rio");
		}

		

	}

}
