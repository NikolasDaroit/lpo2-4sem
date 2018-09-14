package br.edu.ifrs.canoas.lpoo2.aula01.carro;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	
	public void liga() {
		System.out.println("O carro está ligado!");
	}
		
	public void acelera(double quantidade) {
		double novaVelocidade = quantidade + this.velocidadeAtual;
		this.velocidadeAtual = novaVelocidade;
	}
	
	int getMarcha(){
		if (this.velocidadeAtual < 0)
			return -1;
		else if (this.velocidadeAtual <= 40)
			return 1;
		else if (this.velocidadeAtual <= 60)
			return 2;
		else 
			return 3; 
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
