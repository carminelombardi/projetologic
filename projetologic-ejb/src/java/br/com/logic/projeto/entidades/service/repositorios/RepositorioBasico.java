/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.logic.projeto.entidades.service.repositorios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author lucas
 */
public abstract class RepositorioBasico {
    
    private final  EntityManager entityManager;
    
    public RepositorioBasico(EntityManager entityManager){
        this.entityManager = entityManager;


    }
    
    protected EntityManager getEnttityManager(){
        return entityManager;
    
    }
    
    protected <T> List<T> getPureList(Class<T> classToCast, String query, Object... values){
        Query qr = createQuery(query, values);
        return qr.getResultList();
        
    }
    
    protected <T> T getPurePojo(Class<T> classToCast, String query, Object... values){
        Query qr = createQuery(query, values);
        return (T) qr.getSingleResult();
                
    }
        
    
    protected int executeCommand (String query, Object... values){
        Query qr = createQuery(query, values);
        return qr.executeUpdate();
        
    }
    
    private Query createQuery (String query, Object... values){
    Query qr = getEnttityManager().createQuery(query);
        for (int i = 0; i < values.length; i++) {
            qr.setParameter(i, values[i]);
        }
     return qr;
    }
}
