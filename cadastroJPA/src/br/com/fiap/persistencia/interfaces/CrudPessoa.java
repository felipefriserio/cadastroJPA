package br.com.fiap.persistencia.interfaces;

import java.sql.SQLException;

import br.com.fiap.persistencia.model.Pessoa;

public interface CrudPessoa {
	public Pessoa insere(Pessoa p)  throws SQLException;
	public Pessoa busca(String cpf) throws SQLException;
	public void deleta (Pessoa p)   throws SQLException;
	public void atualiza (Pessoa p) throws SQLException;
}
