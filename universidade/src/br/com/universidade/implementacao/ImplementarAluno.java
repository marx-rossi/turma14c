package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		while (JOptionPane.showConfirmDialog(null, "Inserir um novo Auno?", "Novo Aluno", JOptionPane.YES_NO_OPTION)==0) {
			
			Aluno aluno = new Aluno();
			aluno.setAll(Integer.parseInt(JOptionPane.showInputDialog("Informe o RM")), JOptionPane.showInputDialog("Informe o nome"), JOptionPane.showInputDialog("Informe o e-mail"));
			System.out.println(aluno.getAll());
			System.out.println(aluno.getUser());
			
		}
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
