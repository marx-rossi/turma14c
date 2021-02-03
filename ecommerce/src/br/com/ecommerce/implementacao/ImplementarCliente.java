package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.ClientePF;
import br.com.ecommerce.beans.ClientePJ;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {
	
		char resp = Magica.s("Digite F para pessoa física o J para Jurídica").charAt(0);
		
		if (resp=='F') {
			ClientePF pf = new ClientePF();
			pf.setAll(Magica.s("Nome"), new Endereco(), Magica.s("Telefone"), Magica.s("CPF"), Magica.s("RG"));
			System.out.println(pf.getAll());
		}else if (resp=='J') {
			ClientePJ pj = new ClientePJ();
			pj.setCnpj(Magica.s("CNPJ"));
			pj.setContato(Magica.s("Contato"));
			pj.setEndereco(new Endereco());
			pj.setNome(Magica.s("Nome"));
			pj.setTelefone(Magica.s("Telefone"));
			System.out.println(pj.getAll());
		}else {
			System.out.println("Opção inválida");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
