package com.lpoo2.trabalhoJPA.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import lombok.Data;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
@Data
public class PessoaFisica extends Pessoa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String rg;
	private Date dataNascimento;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	public PessoaFisica() {
		super();
	}
   
}
