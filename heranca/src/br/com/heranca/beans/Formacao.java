package br.com.heranca.beans;

import br.com.heranca.util.PadraoFormacao;

public class Formacao implements PadraoFormacao{
	
	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	
	
	public Formacao() {
		super();
	}

	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	public void calcularMensalidade(double fator){
		
	}

	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao = 36;			
		}else if (this instanceof Tecnologo) {
			duracao = 24;			
		}else if (this instanceof Bacharelado){
			if (descricao.contains("ENGENHARIA")) {
				duracao = 60;
			}else {
				duracao = 48;
			}
		}else {
			System.out.println("Forma��o inv�lida");
		}
	}
	
	public double exibirMedia(double ps1, double ps2) {
		double media = (ps1 + ps2)/2;
		return media;				
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		double media = (((ps1 + ps2)*0.8)/2) + (((nac1 + nac2)*0.2)/2);
		return media;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		double media = (((ps1 + ps2)*0.5)/2) + (((nac1 + nac2)*0.2)/2) + (((am1 + am2)*0.3)/2);
		return media;
	}

	public void setAll(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String toString() {
		return "Formacao [descricao=" + descricao + ", periodo=" + periodo + ", mensalidade=" + mensalidade
				+ ", duracao=" + duracao + "]";
	}

	@Override
	public String calcularDesconto(float porc) {
		
		return "sem desconto caraio";
	}
	
	
	
	
	
	
	
	
	
	

}
