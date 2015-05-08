package br.com.caelum.tarefas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefas;

/* Buscando tarefas não finalizadas no banco e retornando em uma lista */

public class ListaTarefasNotEnd {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		@SuppressWarnings("unchecked")
		List<Tarefas> lista = manager.createQuery(
				"select t from Tarefas as t where t.finalizado=false")
				.getResultList();

		for (Tarefas tarefa : lista) {
			System.out.println(tarefa.getDescricao());
		}
		manager.close();
	}
}
