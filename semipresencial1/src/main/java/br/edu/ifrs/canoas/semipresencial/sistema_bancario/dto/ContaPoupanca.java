package br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto;

public class ContaPoupanca  extends Conta {

	public ContaPoupanca(Integer nroConta, Integer agencia, Double saldo) {
		super(nroConta, agencia, saldo);
	}

	@Override
	public boolean saca(Double valor) {
		// TODO Auto-generated method stub
		if (valor > this.getSaldo()) {
			throw new LimiteUltrapassadoException();
		}
		this.setSaldo(this.getSaldo()-valor);
		return true;
		
	}

}
