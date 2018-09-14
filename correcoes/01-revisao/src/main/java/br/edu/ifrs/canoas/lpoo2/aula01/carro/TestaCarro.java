package br.edu.ifrs.canoas.lpoo2.aula01.carro;

public class TestaCarro {
	
	public static void main(String[] args) {
		Carro gol = new Carro();
		Motor motor = new Motor();
		gol.motor = motor;
		gol.cor="Preto";
		gol.modelo="GLX";
		gol.velocidadeAtual=0;
		gol.velocidadeMaxima=80;
		
		gol.liga();
		gol.acelera(20);
		System.out.println("Velocidade Atual = "+gol.velocidadeAtual);
		System.out.println("Macha = "+gol.getMarcha());
		gol.acelera(70);
		System.out.println("Velocidade Atual = "+gol.velocidadeAtual);
		System.out.println("Macha = "+gol.getMarcha());
	}

}
