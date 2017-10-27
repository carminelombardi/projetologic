/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.logic.projeto.entidades.service.repositorios;

import br.com.logic.projeto.entidades.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author lucas
 */
public class RepositorioUsuario extends RepositorioBasico {

    public RepositorioUsuario(EntityManager entityManager) {
        super(entityManager);
    }

    public Usuario getUsuario(int id){
      return  getEnttityManager().find(Usuario.class, id);
        
    }
      
}
