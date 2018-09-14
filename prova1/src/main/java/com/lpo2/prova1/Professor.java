package com.lpo2.prova1;

public class Professor extends Pessoa implements Assalariado{
	private Integer indiceTitulacao;
	
	public Professor() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Professor(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

	@Override
	public Double getSalario() {
		// 1000 * indiceTitulacao
		return (double) ((this.indiceTitulacao > 1) ? 1000*this.indiceTitulacao : 1000);
	}

	@Override
	public void setMatricula(String matricula) {
		// exatos 6 digitos
		if (matricula.length() == 6) {
			this.matricula = matricula;
		}else {
			throw new IllegalArgumentException("Quantidade invalida de caracteres ou valores ");
		}
		 
		
	}

}
