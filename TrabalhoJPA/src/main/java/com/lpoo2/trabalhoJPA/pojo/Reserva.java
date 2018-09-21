package com.lpoo2.trabalhoJPA.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity
@Data
public class Reserva implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private Date data;
	private Double valor;
	
	public Reserva() {
		super();
	}
   
}
