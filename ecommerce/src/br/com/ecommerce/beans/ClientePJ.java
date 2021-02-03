package br.com.ecommerce.beans;

public class ClientePJ extends Cliente {
	
	private String cnpj;
	private String contato;
	public String getBasico() {
		return "RazaoSocial: " + super.getNome() + "\nContato: " + contato;
	}
	
	
	public ClientePJ() {
		super();
	}


	public ClientePJ(String nome, Endereco endereco, String telefone, String cnpj, String contato) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.contato = contato;
	}


	public void setAll(String nome, Endereco endereco, String telefone, String cnpj, String contato) {
		super.setAll(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.contato = contato;
	}



	public String getAll() {
		return "ClientePJ [cnpj=" + cnpj + ", contato=" + contato + super.getAll() + "]";
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	
	
	
	
	
	
	
	

}
