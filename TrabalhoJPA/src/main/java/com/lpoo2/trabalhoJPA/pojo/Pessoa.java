package com.lpoo2.trabalhoJPA.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Data
public class Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String nome;
	@Id
	private String email;
	private String telefone;
	public Pessoa() {
		super();
	}
   
}
