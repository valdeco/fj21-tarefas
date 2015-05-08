package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefas;

public class RemoveTarefas {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		Tarefas encontrada = manager.find(Tarefas.class, 6L);

		manager.getTransaction().begin();
		manager.remove(encontrada);
		manager.getTransaction().commit();				
		
		manager.close();
	}

}
