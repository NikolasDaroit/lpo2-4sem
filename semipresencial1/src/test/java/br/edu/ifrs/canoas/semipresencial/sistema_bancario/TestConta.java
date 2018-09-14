package br.edu.ifrs.canoas.semipresencial.sistema_bancario;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.Banco;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.Cliente;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.Conta;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.ContaCorrente;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.ContaPoupanca;
import br.edu.ifrs.canoas.semipresencial.sistema_bancario.dto.LimiteUltrapassadoException;

public class TestConta {
	private Cliente cliente;
	private Banco banco;
	private Conta cc,cp,ccn,cpn;

	/*
	 * Teste de Unidade para classe Conta (mínimo de 2 asserções (instruções/comandos) diferentes por método)
	 */
	@Before 
	public void setup() {
		cliente = new Cliente("teste");
		banco = new Banco();
		cc = new ContaCorrente(12, 1, 1.0);
		cp = new ContaPoupanca(13, 2, 2.0);
		ccn = new ContaCorrente(14, 3, -3.0);
		cpn = new ContaPoupanca(99, 99, -4.0);
		
		banco.addCarteiraConta(cc, cliente);
		banco.addCarteiraConta(cp, cliente);
		banco.addCarteiraConta(ccn, cliente);
		banco.addCarteiraConta(cpn, cliente);
	}
	@Test 
	public void testContaCorrentePositiva() {
		assertThat(cc.getSaldo()).isPositive();
	}
	@Test 
	public void testContaCorrenteNegativa() {
		assertThat(ccn.getSaldo()).isNegative();
	}
	@Test 
	public void testContaCorrenteNotEqual() {
		assertThat(cc).isNotEqualByComparingTo(cp);
	}
	@Test 
	public void testContaSacaException() {
		// when
		Throwable thrown = catchThrowable(() -> { cc.saca(100.0); });

	   // then
	   assertThat(thrown).isInstanceOf(Exception.class);                    
		   
	   assertThatThrownBy(() -> { cc.saca(100.0); })
			.isInstanceOf(LimiteUltrapassadoException.class);
		
	}
	@Test 
	public void testContaSaque() {
		cp.saca(2.0);
		assertThat(cp.getSaldo()).isEqualTo(0.0);
	}
	@Test 
	public void testContaDeposita() {
		cpn.deposita(8.0);
		assertThat(cpn.getSaldo()).isEqualTo(4.0);
	}
	@Test 
	public void testContaDepositaNegativo() {
		
		assertThatThrownBy(() -> { cpn.deposita(-8.0); })
			.isInstanceOf(IllegalArgumentException.class);
	}
}
