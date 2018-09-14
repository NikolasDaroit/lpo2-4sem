package com.lpo2.prova1;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class EnderecoTest {
	// mínimo 5 asserções diferentes
	
	Endereco endereco;
	
	@Before
	public void setup() {
		endereco = new Endereco();
		endereco.setCep(93285000);
		endereco.setNumero(0);
		endereco.setRua("Rua dos Bobos");	
		
	}
	@Test
	public void testEnderecoCepCorreto() {
		assertThat(this.endereco.getCepFormatado()).containsPattern("^\\d{5}-\\d{3}$");
	}
	
	@Test
	public void testNumeroValido() {
		assertThat(this.endereco.getNumero()).isNotNull();
	}
	
	@Test
	public void testCepPlaceholder() {
		this.endereco.setCep(4546);
		assertThat(this.endereco.getCepFormatado()).isEqualTo("45460-000");
	}

	@Test
	public void testCepNegativoException() {
		this.endereco.setCep(-23423432);
		assertThatThrownBy(() -> { this.endereco.getCepFormatado(); })
		.isInstanceOf(IllegalArgumentException.class);
	}
	
	@Test
	public void testCepVazioException() {
		Endereco end = new Endereco();
		assertThat(end.getCepFormatado()).hasSize(9);
		
	}
	@Test
	public void testCepVazioDiferente() {
		Endereco end = new Endereco();
		assertThat(end.getCepFormatado()).isNotEqualTo(this.endereco.getCepFormatado());
		
	}
}
