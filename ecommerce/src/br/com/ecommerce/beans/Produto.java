package br.com.ecommerce.beans;

public class Produto {
	
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	
	

	public Produto() {
		super();
	}

	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}


	public float getTotalCompra() {
		return qtde * valorCompra;
	}
	
	public float getTotalVenda() {
		return qtde * valorVenda;
	}
	
	public void atualizarValores(float porc) {
		valorVenda = valorVenda * (1+porc/100);
		valorCompra = valorCompra * (1+porc/100);
	}
	
	public String getAll() {
		return "Identificação: " + id + "\nDescrição: " + descricao + "\nValor de Venda: " + valorVenda + "\nValor de Compra: " + valorCompra + "\nQuantidade: " + qtde;
	}
	
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		
	}
	
	
	
	
	
	
	
	

	}
