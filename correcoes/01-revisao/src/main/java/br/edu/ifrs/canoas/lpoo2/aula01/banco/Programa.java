package br.edu.ifrs.canoas.lpoo2.aula01.banco;

class Programa {
	public static void main(String[] args) {
		// criando a conta
		Conta minhaConta = new Conta();
		Cliente cliente = new Cliente();
		
		minhaConta.titular = cliente;
		minhaConta.titular.nome = "Rodrigo";
	    cliente.nome = "Fulano";
	    System.out.println(minhaConta.titular.nome);
		
	}
}
