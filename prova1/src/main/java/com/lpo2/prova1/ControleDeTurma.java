package com.lpo2.prova1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControleDeTurma {
	private Map<Disciplina, Turma> turmas;
	
	public ControleDeTurma() {
		this.turmas = new HashMap<>();
	}
	public Boolean adicionaDisciplina(Disciplina disciplina) {
		// adiciona somente se NÃO TEM a disciplina no Map.
		// Coloca uma turma em branco (new Turma())
		if (turmas.containsKey(disciplina)) {
			return false;
		}
		turmas.put(disciplina, new Turma());
		return true;
	}
	
	public Boolean adicionaTurmaNaDisciplina(Disciplina disciplina, Turma turma) {
		// Adiciona somente se TEM a disciplina no Map
		// Retorna false se não tem a disciplina no Map
		if (turmas.containsKey(disciplina)) {
			turmas.put(disciplina, turma);
			return true;
		}
		return false;
	}
	
	public Integer getQtdeTotalAlunos() {
		// Retorna o total de alunos cadastrados considerando todas as turmas
		int totalAlunos = 0;
		
		for(Map.Entry<Disciplina, Turma> entry : turmas.entrySet()) {
		    Turma turma = entry.getValue();
		    totalAlunos += turma.getAlunos().size();
		}
		return totalAlunos;
	}
	
	public List<String> getNomeProfessoresDasTurmas(){
		// Metodo que percorre todas as turmas selecionando os professores e 
		// inserindo em ma lista a ser retornada
		List<String> professores = new ArrayList<>();
		for(Map.Entry<Disciplina, Turma> entry : turmas.entrySet()) {
		    Turma turma = entry.getValue();
		    
		    professores.add(turma.getProfessor().getNome());
		}
		return professores;
	}
	
	public Map<Disciplina, Turma> getTurmas() {
		return turmas;
	}
	
	
}
