package decisao;

import javax.swing.JOptionPane;

public class Hotel {

	public static void main(String[] args) {
		byte diarias = Byte.parseByte(JOptionPane.showInputDialog("Informe a quantidade de diárias"));
		
		if (diarias<15) {
			System.out.println("Valor das diárias: " + (diarias * 85.50));
			
		}else if (diarias==15) {
			System.out.println("Valor das diárias: " + (diarias * 86.00));
			
		}else {
			System.out.println("Valor das diárias: " + (diarias * 88));
		}
		
		
		
		
		
		
		
		

	}

}
