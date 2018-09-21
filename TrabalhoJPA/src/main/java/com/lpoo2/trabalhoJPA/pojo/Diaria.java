package com.lpoo2.trabalhoJPA.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * Entity implementation class for Entity: Diaria
 *
 */
@Entity
@Data
public class Diaria implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private Date data;
	public Diaria() {
		super();
	}
   
}
