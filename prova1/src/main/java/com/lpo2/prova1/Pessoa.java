package com.lpo2.prova1;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
	protected String matricula;
	private String nome;
	private List<Endereco> enderecos;
	
	public Pessoa() {
		this.enderecos = new ArrayList<>();
		Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());
		this.nome = "Pessoa"+dataDeHoje;
	}
	public Pessoa(String nome) {
		this.enderecos = new ArrayList<>();
		this.nome = nome;
	}
	
	public abstract void setMatricula(String matricula);
	public boolean adicionaEndereco(Endereco endereco) {
		if (enderecos.contains(endereco)) {
			return true;
		}else {
			enderecos.add(endereco);
			return true;
		}
		
	}
	public String getNome() {
		return nome;
	}
	
}
