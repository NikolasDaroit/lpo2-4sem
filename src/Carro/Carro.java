package Carro;

public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private Motor motor;
	
	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima, Motor motor) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.motor = motor;
	}
	
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void liga() {
		System.out.println("ligado");
	}
	public void acelera(double quantidade) {
		this.velocidadeAtual+=quantidade;
	}
	public int getMarcha() {
		if (this.velocidadeAtual <= 0) {
			return -1;
		}else if(this.velocidadeAtual >0 && this.velocidadeAtual <=40) {
			return 1;
		}else if(this.velocidadeAtual >40 && this.velocidadeAtual <=60) {
			return 2;
		}
		return 3;
	}
}
