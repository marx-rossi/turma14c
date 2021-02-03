package br.com.eleicao.beans;

import java.util.List;

public class Urna {
	
	private int zona;
	private int secao;
	private String cidade;
	private List<Voto> votos;
	
	public int totalVotos2() {
		return votos.size();
	}
	
	public int totalVotos() {
		int count = 0;
		for (Voto objeto : votos) {
			count++;			
	}
		return count;
	}

	public Urna() {
		super();
	}

	public Urna(int zona, int secao, String cidade, List<Voto> votos) {
		super();
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.votos = votos;
	}

	public void setAll(int zona, int secao, String cidade, List<Voto> votos) {
		this.zona = zona;
		this.secao = secao;
		this.cidade = cidade;
		this.votos = votos;
	}

	@Override
	public String toString() {
		return "Urna [zona=" + zona + ", secao=" + secao + ", cidade=" + cidade + "]";
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List<Voto> getVotos() {
		return votos;
	}

	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}