package com.lpoo2.trabalhoJPA.pojo;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

/**
 * Entity implementation class for Entity: DiariaAvulsa
 *
 */
@Entity
@Data
public class DiariaAvulsa extends Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;
 
	public DiariaAvulsa() {
		super();
	}
   
}
