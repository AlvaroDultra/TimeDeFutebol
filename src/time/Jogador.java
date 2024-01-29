package time;

public class Jogador {
	String nome;
	int idade;
	String posicao;
	int numero;
	int cartoes_amarelos = 0;
	
	void passar(String companheiro) {
		System.out.println(nome + " passou para " + companheiro);
	}
	
	
	void correr() {
		System.out.println(nome + " esta correndo");
	}
	
	void sair() {
		System.out.println(nome + " foi substituido");
	}
	
	int levar_cartao() {
		System.out.println(nome + " levou um cartao amarelo");
		cartoes_amarelos++;
		if (cartoes_amarelos==2) { 
			System.out.println(nome + " foi expulso!");
		}
		return cartoes_amarelos;
		
	}
	

	
	
	

}
