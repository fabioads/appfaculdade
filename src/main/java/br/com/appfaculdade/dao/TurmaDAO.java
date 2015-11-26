package br.com.appfaculdade.dao;

import javax.persistence.EntityManager;

import br.com.appfaculdade.model.Turma;

/**
 * @author Fábio Henrique Pires
 */
public class TurmaDAO extends GenericDAO<Long, Turma>{

	public TurmaDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
}