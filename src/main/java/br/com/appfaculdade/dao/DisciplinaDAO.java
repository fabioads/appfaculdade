package br.com.appfaculdade.dao;

import javax.persistence.EntityManager;

import br.com.appfaculdade.model.Disciplina;

/**
 * @author Fábio Henrique Pires
 */

public class DisciplinaDAO extends GenericDAO<Long, Disciplina>{

	public DisciplinaDAO(EntityManager entityManager) {
		super(entityManager);
	}

}
