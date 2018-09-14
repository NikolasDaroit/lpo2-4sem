package com.lpo2.prova1;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private Professor professor;
	private List<Aluno> alunos;
	
	public Turma() {
		this.alunos = new ArrayList<>();
	}
	public Turma(Professor professor) {
		this.professor = professor;
		this.alunos = new ArrayList<>();
	}
	public Boolean adicionaAluno(Aluno aluno) {
		if (alunos.size() > 30) {
			return false;
		}
		alunos.add(aluno);
		return true;
	}
	public List<Aluno> getAlunos(){
		return alunos;
	}
	public Professor getProfessor() {
		// TODO Auto-generated method stub
		return this.professor;
	}
}
