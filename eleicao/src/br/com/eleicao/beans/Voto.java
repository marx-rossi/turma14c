package br.com.eleicao.beans;

public class Voto {

	private Pessoa eleitor;
	private Pessoa candidato;
	private boolean primeitoTurno;
	
	public Voto() {
		super();
	}

	public Voto(Pessoa eleitor, Pessoa candidato, boolean primeitoTurno) {
		super();
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.primeitoTurno = primeitoTurno;
	}

	public void setAll(Pessoa eleitor, Pessoa candidato, boolean primeitoTurno) {
		this.eleitor = eleitor;
		this.candidato = candidato;
		this.primeitoTurno = primeitoTurno;
	}

	@Override
	public String toString() {
		return "Voto [primeitoTurno=" + primeitoTurno + "]";
	}

	public Pessoa getEleitor() {
		return eleitor;
	}

	public void setEleitor(Pessoa eleitor) {
		this.eleitor = eleitor;
	}

	public Pessoa getCandidato() {
		return candidato;
	}

	public void setCandidato(Pessoa candidato) {
		this.candidato = candidato;
	}

	public boolean isPrimeitoTurno() {
		return primeitoTurno;
	}

	public void setPrimeitoTurno(boolean primeitoTurno) {
		this.primeitoTurno = primeitoTurno;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
