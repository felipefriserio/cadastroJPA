package br.com.fiap.persistencia.dao;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import br.com.fiap.persistencia.JpaUtil;
import br.com.fiap.persistencia.interfaces.CrudPessoa;
import br.com.fiap.persistencia.model.Pessoa;

public class PessoaDAO implements CrudPessoa{

	@Override
	public Pessoa insere(Pessoa pessoa) throws SQLException {
		EntityManager em =  JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		return pessoa;
	}

	@Override
	public Pessoa busca(String cpf) throws SQLException {
		EntityManager em =  JpaUtil.getEntityManager();
		em.getTransaction().begin();
		Pessoa pessoa = em.find(Pessoa.class, cpf);
		em.getTransaction().commit();
		return pessoa;
	}

	@Override
	public void deleta(Pessoa pessoa) throws SQLException {
		EntityManager em =  JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(pessoa));
		em.getTransaction().commit();
	}

	@Override
	public void atualiza(Pessoa pessoa) throws SQLException {
		EntityManager em =  JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
	}
	
}
