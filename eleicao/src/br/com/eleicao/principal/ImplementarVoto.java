package br.com.eleicao.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.eleicao.beans.Candidato;
import br.com.eleicao.beans.Eleitor;
import br.com.eleicao.beans.Pessoa;
import br.com.eleicao.beans.Urna;
import br.com.eleicao.beans.Voto;

public class ImplementarVoto {

	public static void main(String[] args) {
		
		Pessoa eleitor1 = new Eleitor("Joao", 123, true);
		Pessoa deputado1 = new Candidato("Odorico Paraguaçu", 1, "Deputado", "PFL - Partido Forma Ladão");
		
		Pessoa eleitor2 = new Eleitor("Jaozin", 2, true);
		Pessoa deputado2 = new Candidato("Frederico Timoteo", 2, "Deputado", "PL - Partido Ladão");
		
		Voto voto1 = new Voto(eleitor1, deputado1, true);
		Voto voto2 = new Voto(eleitor2, deputado1, true);
		
		List<Voto> votosx = new ArrayList<Voto>();
		
		votosx.add(voto1);
		votosx.add(voto2);
		
		Urna urna = new Urna(12, 13, "Ribeirão Preto", votosx);
		
		System.out.println(urna.totalVotos());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
