package br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private Map<Conta, Cliente> carteiraContas;
	public Banco() {
		this.carteiraContas =  new HashMap<Conta, Cliente>();
	}
	public List<Conta> getContasOrdenadas(){
		List<Conta> contas = new ArrayList<Conta>(carteiraContas.keySet());
		Collections.sort(contas);

		return contas;
	
	}
	public Map getCarteiraContas() {
		
		return this.carteiraContas;
	}
	public void addCarteiraConta(Conta conta, Cliente cliente) {
		carteiraContas.put(conta, cliente);
	}
	public void removeCarteiraConta(Conta conta) {
		carteiraContas.remove(conta);
	}
	
}
