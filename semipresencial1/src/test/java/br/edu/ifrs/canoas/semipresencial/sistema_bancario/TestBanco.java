package br.edu.ifrs.canoas.semipresencial.sistema_bancario;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.Banco;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.Cliente;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.Conta;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.ContaCorrente;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.ContaPoupanca;

public class TestBanco {
	private Cliente cliente;
	private Banco banco;
	private Conta c, c1, c2, c3;
	/*
	 * Implemente o Teste de Unidade para classe Banco 
	 * (mínimo de 5 asserções (instruções/comandos) diferentes para o método getContasOrdenadas)
	 */
	
	@Before 
	public void setup() {
		cliente = new Cliente("teste");
		banco = new Banco();
		c = new ContaCorrente(12, 1, 1.0);
		c1 = new ContaCorrente(13, 2, 2.0);
		c2 = new ContaCorrente(14, 3, 3.0);
		c3 = new ContaCorrente(99, 99, 99.0);
		banco.addCarteiraConta(c2, cliente);
		banco.addCarteiraConta(c, cliente);
		banco.addCarteiraConta(c1, cliente);
	}
	@Test 
	public void testContasOrdenadas() {
		assertThat(banco.getContasOrdenadas()).isSorted();
	}
	
	@Test 
	public void testContasOrdenadasPoupanca() {
		Conta poupanca = new ContaPoupanca(15, 4, 10.0);		
		banco.addCarteiraConta(poupanca, cliente);
		List<Conta> contasOrdenadas = banco.getContasOrdenadas();
		
		List<Conta> contasEsperadas = new ArrayList<>();
		contasEsperadas.add(c);
		contasEsperadas.add(c1);
		contasEsperadas.add(c2);
		contasEsperadas.add(poupanca);

		assertThat(contasOrdenadas).containsSequence(contasEsperadas);
	}
	
	@Test 
	public void testContasOrdenadasVazio() {
		banco = new Banco();
		List<Conta> contasOrdenadas = banco.getContasOrdenadas();		
		assertThat(contasOrdenadas).isEmpty();
	}
	@Test 
	public void testContasOrdenadasHasConta() {
		assertThat(banco.getContasOrdenadas()).doesNotContain(c3);
	}
	@Test 
	public void testContasOrdenadasTipoConta() {
		assertThat(banco.getContasOrdenadas()).hasOnlyElementsOfTypes(Conta.class);
	}
	@Test 
	public void testContasOrdenadasRemoveConta() {
		banco.removeCarteiraConta(c1);
		assertThat(banco.getContasOrdenadas()).isSorted();
	}
}
