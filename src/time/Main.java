package time;

public class Main {

	public static void main(String[] args) {
		//criando jogadores
		//goleiro
		Goleiro Marcos_filipe = new Goleiro();
		Marcos_filipe.nome= "Marcos Filipe";
		Marcos_filipe.idade= 30;
		Marcos_filipe.numero= 1;
		
		//zagueiros
		Zagueiro Kanu = new Zagueiro();
		Kanu.nome="Kanu";
		Kanu.idade=24;
		Kanu.numero=4;
		
		Zagueiro Cuesta = new Zagueiro();
		Cuesta.idade = 30;
		Cuesta.nome = "Cuesta";
		Cuesta.numero = 3;
		
		//laterais
		Lateral Gilberto = new Lateral();
		Gilberto.nome = "Gilberto";
		Gilberto.idade=31;
		Gilberto.numero=2;
		
		Lateral Cicinho = new Lateral();
		Cicinho.nome="Cicinho";
		Cicinho.idade=23;
		Cicinho.numero=6;
		
		//meias
		Meia Everton = new Meia();
		Everton.nome = "Everton Ribeiro";
		Everton.idade = 34;
		Everton.numero = 10;
		
		Meia Jean = new Meia();
		Jean.nome = "Jean Lucas";
		Jean.idade = 22;
		Jean.numero=7;
		
		Meia Caio = new Meia();
		Caio.nome = "Caio Alexandre";
		Caio.idade = 25;
		Caio.numero = 5;
		
		Meia Cauly = new Meia();
		Cauly.nome = "Cauly";
		Cauly.idade = 30;
		Cauly.numero = 8;
		
		//atacantes
		Atacante Everaldo = new Atacante();
		Everaldo.nome = "Everaldo";
		Everaldo.idade = 30;
		Everaldo.numero = 9;
		
		Atacante Biel = new Atacante();
		Biel.nome = "Biel";
		Biel.idade = 22;
		Biel.numero = 11;
		
		//jogada de gol
		Kanu.desarmar();
		Kanu.passar(Gilberto.nome);
		Gilberto.passar(Cauly.nome);
		Cauly.driblar();
		Cauly.passar(Everton.nome);	
		Everton.enfiar(Everaldo.nome);
		Everaldo.fazer_gol();
		
		//jogador sendo expulso
		Kanu.levar_cartao();
		Kanu.levar_cartao();
		
		
		
		
		
		
		
		
		
		

	}

}