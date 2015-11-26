package br.com.appfaculdade.dao;

import javax.persistence.EntityManager;

import br.com.appfaculdade.model.Aluno;

/**
 * @author Fábio Henrique Pires
 */

public class AlunoDAO extends GenericDAO<Long, Aluno>{

	public AlunoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
