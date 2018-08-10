package Carro;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor motor = new Motor(2500, "flex");
		Carro carro = new Carro("roxo" , "sedan", 0, 80, motor);
		carro.liga();
		carro.acelera(20);
		System.out.println(carro.getVelocidadeAtual());
	}

}
