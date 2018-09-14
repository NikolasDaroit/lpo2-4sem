package com.lpo2.prova1;

public class TecnicoAdministrativo extends Pessoa implements Assalariado{

	@Override
	public Double getSalario() {
		return (double) 1000;
	}

	@Override
	public void setMatricula(String matricula) {
		// exatos 8 digitos
		if (matricula.length() == 8) {
			this.matricula = matricula;
		}else {
			throw new IllegalArgumentException("Quantidade invalida de caracteres ou valores ");
		}
	}

}
