package repeticao;

import javax.swing.JOptionPane;

public class DiaMesAno {

	public static void main(String[] args) {
		
		short ano = Short.parseShort(JOptionPane.showInputDialog("Informe o ano"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Informe o mes"));
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Informe o dia"));
		String user = JOptionPane.showInputDialog("Informe seu usuario");
		
		while (user.length()<=5 || user.length()>=20) {
			user = JOptionPane.showInputDialog("Informe seu usuario novamente");
			
		}
		
		while (ano<=2003) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Informe o ano novamente"));
			
		}
		
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Informe o mes novamente"));;
			
		}
		
		if (mes==2) {
			while (dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Informe o dia novamente"));
				
			}
			
		}else if (mes==4 || mes==6 || mes==9 || mes==11) {
			while (dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Informe o dia novamente"));
				
			}
		}else {
			while (dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Informe o dia novamente"));
				
		}
			
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		System.out.println("Usu�rio: " + user);
		
		
		
		
		
		
		



	}

}
