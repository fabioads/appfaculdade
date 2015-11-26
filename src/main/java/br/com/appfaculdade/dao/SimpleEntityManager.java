package br.com.appfaculdade.dao;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
/**
 * @author Fábio Henrique Pires
 * 
 * Esta classe encapsula o trabalho das classes EntityManager e EntityManagerFactory, fazendo somente o essencial
 * 
 */
public class SimpleEntityManager {
    private EntityManager entityManager;
    private EntityManagerFactory factory;
     
    public SimpleEntityManager(EntityManagerFactory factory) {
        this.factory = factory;
        this.entityManager = factory.createEntityManager();
    }
     
    public SimpleEntityManager(String persistenceUnitName){
        factory = Persistence.createEntityManagerFactory(persistenceUnitName);
        this.entityManager = factory.createEntityManager();
    }
 
    public void beginTransaction(){
        entityManager.getTransaction().begin();
    }
     
    public void commit(){
        entityManager.getTransaction().commit();
    }
     
    /**
     * Este médot precisa ser sempre chamado.
     */
    public void close(){
        entityManager.close();
        factory.close();
    }
     
    public void rollBack(){
        entityManager.getTransaction().rollback();
    }
     
    public EntityManager getEntityManager(){
        return entityManager;
    }
}