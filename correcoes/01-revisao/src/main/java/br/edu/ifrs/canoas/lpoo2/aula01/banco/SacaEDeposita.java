package br.edu.ifrs.canoas.lpoo2.aula01.banco;

class SacaEDeposita {
	public static void main(String[] args) {
		// criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.deposita(100);

		Conta minhaContaDosSonhos;
		minhaContaDosSonhos = minhaConta;
		minhaContaDosSonhos.deposita(1000000);
		
		System.out.println(minhaConta.saldo);
		System.out.println(minhaContaDosSonhos.saldo);

	}
}
