package com.thot.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.thot.curso.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
