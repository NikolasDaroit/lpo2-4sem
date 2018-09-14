package com.lpo2.prova1;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ControleDeTurmaTeste {
	// mínimo 2 asserções diferentes por método
	
	ControleDeTurma ct;
	Turma t1, t2, t3;
	Disciplina d1, d2, d3;
	Professor p1, p2, p3;
	Aluno a1, a2, a3;
	
	@Before 
	public void setup() {
		ct = new ControleDeTurma();
		
		d1 = new Disciplina();
		d2 = new Disciplina();
		d3 = new Disciplina();
		p1 = new Professor("Noll");
		p2 = new Professor();
		p3 = new Professor("General Kenobi");
		t1 = new Turma(p3);
		t2 = new Turma(p2);
		t3 = new Turma(p1);
		a1 = new Aluno();
		a2 = new Aluno();
		a3 = new Aluno();
		t1.adicionaAluno(a1);
		t2.adicionaAluno(a1);
		t3.adicionaAluno(a2);
		t3.adicionaAluno(a3);
		ct.getTurmas().put(d3, t3);
	}
	
	@Test
	public void testAdicionaDisciplina() {
		//Boolean adicionaDisciplina(Disciplina disciplina)
		assertThat(ct.adicionaDisciplina(d1)).isTrue();
	}
	@Test
	public void testAdicionaDisciplinaDuplicada() {
		//Boolean adicionaDisciplina(Disciplina disciplina)
		
		assertThat(ct.adicionaDisciplina(d1)).isTrue();
		assertThat(ct.adicionaDisciplina(d1)).isFalse();
		assertThat(ct.getTurmas()).hasSize(2);
	}
	
	@Test
	public void testAdicionaTurmaNaDisciplina() {
		//Boolean adicionaTurmaNaDisciplina(Disciplina disciplina, Turma turma) 
		assertThat(ct.adicionaTurmaNaDisciplina(d1, t1)).isFalse();
		ct.getTurmas().put(d1, new Turma());
		assertThat(ct.adicionaTurmaNaDisciplina(d1, t1)).isTrue();
	
		
	}
	@Test
	public void testAdicionaTurmaNaDisciplina2() {
		//Boolean adicionaTurmaNaDisciplina(Disciplina disciplina, Turma turma)
		ct.adicionaTurmaNaDisciplina(d3, t1);
		assertThat(ct.getTurmas()).containsEntry(d3, t1);
	}
	
	@Test
	public void testGetQtdeTotalAlunos() {
		//Integer getQtdeTotalAlunos()
		assertThat(ct.getQtdeTotalAlunos()).isPositive();
		
	}
	@Test
	public void testGetQtdeTotalAlunosSize() {
		//Integer getQtdeTotalAlunos()
		assertThat(ct.getQtdeTotalAlunos()).isEqualTo(2);
		ct.getTurmas().put(d2, t2);
		assertThat(ct.getQtdeTotalAlunos()).isEqualTo(3);
	}
	
	@Test
	public void testGetNomeProfessoresDasTurmas() {
		//List<String> getNomeProfessoresDasTurmas()
		assertThat(ct.getNomeProfessoresDasTurmas()).isNotEmpty().containsOnlyOnce("Noll");
	}
	@Test
	public void testGetNomeProfessoresDasTurmas2() {
		//Integer getQtdeTotalAlunos()
		ct.getTurmas().put(d1, t1);
		assertThat(ct.getNomeProfessoresDasTurmas()).contains("General Kenobi").hasSize(2);
	}
}
