package com.lpoo2.trabalhoJPA.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * Entity implementation class for Entity: Endereco
 *
 */
@Entity
@Data
public class Endereco implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String uf;
	
	public Endereco() {
		super();
	}
   
}
