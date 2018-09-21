package com.lpoo2.trabalhoJPA.pojo;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

/**
 * Entity implementation class for Entity: DiariaReservada
 *
 */
@Entity
@Data
public class DiariaReservada extends Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;
 
	public DiariaReservada() {
		super();
	}
   
}
