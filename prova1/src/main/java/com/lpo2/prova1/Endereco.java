package com.lpo2.prova1;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Endereco {
	private String rua;
	private Integer numero;
	private Integer cep;

	public String getCepFormatado() {
		// retorna o CEP com a mascara #####-###
		try {
			MaskFormatter mf = new MaskFormatter("#####-###");
			mf.setValueContainsLiteralCharacters(false);
			mf.setPlaceholderCharacter('0');
			return mf.valueToString(this.cep);
		} catch (ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	
}
