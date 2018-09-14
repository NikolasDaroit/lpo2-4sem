package com.lpo2.prova1;

public class Aluno extends Pessoa{
	private Double indiceAproveitamentoCurso;

	@Override
	public void setMatricula(String matricula) {
		// exatos 4 digitos
		if (matricula.length() == 4) {
			this.matricula = matricula;
		}else {
			throw new IllegalArgumentException("Quantidade invalida de caracteres ou valores ");
		}
		
	}
}
