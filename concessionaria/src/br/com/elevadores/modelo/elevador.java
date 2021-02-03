package br.com.elevadores.modelo;

public class elevador {
	
	private byte andarMaximo;
	private byte andarMinimo;
	private byte capacidadePessoas;
	private byte qtdePessoas;
	private byte andarAtual;
	private String nome;
	
	
	public void entrar() {
		qtdePessoas++;
	}

	public void entrar(byte qtde) {
		qtdePessoas = (byte) (qtdePessoas + qtde);
	}
	
	public void sair() {
		qtdePessoas--;
		if (qtdePessoas<0) {
			qtdePessoas=0;
		}
			
	}

	public String subir() {
		andarAtual++;
		if (andarAtual>=andarMaximo) {
			andarAtual=andarMaximo;			
		}
		return "Indo para o andar " + andarAtual;
	}
	
	public String descer() {
		andarAtual--;
		if (andarAtual<=andarMinimo) {
			andarAtual=andarMinimo;			
		}
		return "Indo para o andar " + andarAtual;
	}
	
	public String status() {
		return "Quantidade de pessoas :" + qtdePessoas + "\nAndarAtual: " + andarAtual + ""
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
