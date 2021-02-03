package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Pagamento;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;



public class Implementacao {
	

	public static void main(String[] args) {
		
		Produto produto = new Produto(Magica.i("Insira o id"),Magica.s("descricao"), Magica.f("Informe o valor da venda"), Magica.f("Informe o valor da compra"), Magica.i("Quantidade vendida"));
		
		Endereco endereco = new Endereco("Rua Jose", "123", "naotem", "liberdade", "Mogi Mirim", "Tocantins", "13123123");
				
		Cliente cliente = new Cliente("jao do cuecaum", endereco, "62696961");
		
		Pagamento pagamento = new Pagamento("credito a vista", "1200.00");
		
		Venda venda = new Venda(1111, cliente, produto, "20/01/1900", (float) 1200.00, pagamento);
		
		System.out.println(cliente.getAll());
		
		System.out.println();
		
		while (JOptionPane.showConfirmDialog(null, "Inserir um novo produto?", "Novo Produto", JOptionPane.YES_NO_OPTION)==0) {
			
			;
			aluno.setAll(Integer.parseInt(JOptionPane.showInputDialog("Informe o RM")), JOptionPane.showInputDialog("Informe o nome"), JOptionPane.showInputDialog("Informe o e-mail"));
			System.out.println(aluno.getAll());
			System.out.println(aluno.getUser());
		}
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
