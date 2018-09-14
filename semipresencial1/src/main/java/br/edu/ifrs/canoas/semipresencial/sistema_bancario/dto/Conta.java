package br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto;

public abstract class Conta implements Comparable<Conta>{
	private Integer nroConta;
	private Integer agencia;
	private Double saldo;
	

	public int compareTo(Conta conta) {
		return this.getSaldo() > conta.getSaldo() ? 1 : this.getSaldo() < conta.getSaldo() ? -1 : 0;
	}
	
	public Conta(Integer nroConta, Integer agencia, Double saldo) {
		this.nroConta = nroConta;
		this.agencia = agencia;
		this.saldo = saldo;
		
	}
	
	public abstract boolean saca(Double valor);
	
	public boolean deposita(Double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		throw new IllegalArgumentException("Valor should be greater than zero");
	}
	public Double getSaldo() {
		return saldo;
	}
	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((nroConta == null) ? 0 : nroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (nroConta == null) {
			if (other.nroConta != null)
				return false;
		} else if (!nroConta.equals(other.nroConta))
			return false;
		return true;
	}
	
}
