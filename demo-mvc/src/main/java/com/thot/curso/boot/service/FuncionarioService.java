package com.thot.curso.boot.service;

import java.time.LocalDate;
import java.util.List;

import com.thot.curso.boot.domain.Funcionario;

public interface FuncionarioService {

void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();

	List<Funcionario> buscarPorNome(String nome);

	List<Funcionario> buscarPorCargo(Long id);

	List<Funcionario> buscarPorData(LocalDate entrada, LocalDate saida);
	
}
