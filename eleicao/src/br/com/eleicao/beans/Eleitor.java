package br.com.eleicao.beans;

public class Eleitor extends Pessoa {
	
	private int titulo;
	private boolean ativo;
	
	public Eleitor() {
		super();
	}

	
	public Eleitor(String nome, int titulo, boolean ativo) {
		super(nome);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	
	public void setAll(String nome, int titulo, boolean ativo) {
		super.setNome(nome);
		this.titulo = titulo;
		this.ativo = ativo;
	}


	@Override
	public String toString() {
		return "Eleitor [titulo=" + titulo + ", ativo=" + ativo + ", Nome" + super.getNome() + "]";
	}


	public int getTitulo() {
		return titulo;
	}


	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
