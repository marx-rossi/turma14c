package decisao;

import javax.swing.JOptionPane;

public class ValorEmOrdem {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo n�mero"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro n�mero"));
		int numero_maior;
		int numero_menor;
		int numero_meio;
		
		if (n1>n2 && n1>n3) {
			numero_maior = n1;
			
		}else if (n2>n1 && n2>n3) {
			numero_maior = n2;			
		}else {
			numero_maior = n3; 
		}
		
		
		
		if (n1<n2 && n1<n3) {
			numero_menor = n1;
			
		}else if (n2<n1 && n2<n3) {
			numero_menor = n2;			
		}else {
			numero_menor = n3; 
		}		
			
		
		
		if (n1<n2 && n1>n3 || n1>n2 && n1<n3) {
			numero_meio = n1;
			
		}else if (n2<n1 && n2>n3 || n2>n1 && n2<n3) {
			numero_meio = n2;			
		}else {
			numero_meio = n3; 
		}		
		
		System.out.println(numero_maior + " " + numero_meio + " " + numero_menor + " ");
		

	}

}
