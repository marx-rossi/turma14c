package br.com.brconcessionario.teste;

public class Veiculo {
	
	private String modelo;
	private String placa;
	private float valor;
	private boolean status;
	private float velocidadeAtual;
	
	
	public void preencherModelo(String param) {
		if (param.length()>5) {
			modelo = param.substring(0, 5).toUpperCase();
			
		}else
		modelo = param.toUpperCase();
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	
	
	public void preencherPlaca(String param) {
		if (param.length()>7) {
			placa = param.substring(0, 7).toUpperCase();
			
		}else
		placa = param.toUpperCase();
	}
	
	public String retornarPlaca() {
		return placa;
	}
	
	
	public void preencherValor(float param) {
		if (param<0) {
			System.out.println("Valor inválido");
		}else
			
		valor = param;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	
	public void preencherStatus(String param) {
		if (param.toUpperCase().equals("SIM")) {
			status=true;
		}else {
			status=false;
		}
		
	}
	
	public String retornarStatus() {
		if (status==true) {
			return "Sim";			
		}else {
			return "Não";
		}

	}
	
	
	public void preencherVelocidadeAtual(float param) {
		
		velocidadeAtual = param;
	}
	
	public float retornarVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	
	public float retornarDesconto() {
		return valor * (float) 0.95;
	}
	
	
	public String aplicarReajuste(float porcentagem) {
		valor = valor * (1+(porcentagem/100));
		return "Valor atualizado";
	}
	
	
	public void acelerar(float acelerar) {
		if (status=true) {
			velocidadeAtual = acelerar + velocidadeAtual;
		}
	}	

	
	public void brecar() {
		if (status=true) {
			velocidadeAtual = 0;
		}
	}
	
	
	public String desligar() {
		status=false; 
		velocidadeAtual = 0;
		return "Desligado";
	}
	
	
	public String ligar() {
		status=true; 
		return "Ligado";
	}
	
	
	public String retornarResumo() {
			
		String retornoString = "";
		if (status==true) {
			retornoString = "Sim";			
		}else {
			retornoString = "Não";
		}
		
		return modelo + velocidadeAtual + retornoString;
		
	}	
	
	
	
	
}
