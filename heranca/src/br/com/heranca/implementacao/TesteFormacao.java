package br.com.heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.heranca.beans.Bacharelado;
import br.com.heranca.beans.Formacao;
import br.com.heranca.beans.Medio;
import br.com.heranca.beans.Tecnologo;
import br.com.heranca.util.Magica;

public class TesteFormacao {

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Tecnologo\n2 - Bacharelado\n3 - Medio"));
		
		Formacao formacao = new Formacao();
		
		if (opcao == 1) {
			formacao = new Tecnologo(Magica.s("Descri��o"), 
					Magica.i("Periodo: 1 Manh� / 2 Noite"), 
					0, 
					0, 
					true);
		}else if (opcao == 2) {
			formacao = new Bacharelado(Magica.s("Descri��o"), 
					Magica.i("Periodo: 1 Manh� / 2 Noite"), 
					0, 0, Magica.s("Projeto de Conclus�o"), Magica.i("Carga Hor�ria Est�gio"));
		}else if (opcao == 3) {
			formacao = new Medio(
					Magica.s("Descri��o"), 
					Magica.i("Periodo: 1 Manh� / 2 Noite"), 
					0, 
					0, 
					Magica.s("Tipo"));
		}else {
			System.out.println("Curso inv�lido");
		}

		formacao.definirDuracao();
		formacao.calcularMensalidade(0.2);
		System.out.println(formacao.toString()); 
		System.out.println(formacao.calcularDesconto((float) 0.1));
		System.out.println(formacao.calcularDesconto(0));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
