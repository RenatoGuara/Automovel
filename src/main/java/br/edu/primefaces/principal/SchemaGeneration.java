/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.primefaces.principal;

import br.edu.primefaces.modelo.Automovel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author renato
 */
public class SchemaGeneration {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("AUTO_PU");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Automovel auto = new Automovel();
        auto.setAnoFabricacao(2014);
        auto.setObservacoes("Nunca foi batido");
        manager.persist(auto);
        manager.getTransaction().commit();
        
        System.out.println("Automovel:" +auto.getObservacoes()+"--"+auto.getAnoFabricacao());

    }

}
