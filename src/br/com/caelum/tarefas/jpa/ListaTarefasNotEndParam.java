package br.com.caelum.tarefas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.caelum.tarefas.modelo.Tarefas;

/* Passando um par�metro para a pesquisa
 * para recuperar tarefas n�o finalizadas no banco */

public class ListaTarefasNotEndParam {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		Query query = manager
				.createQuery("select t from Tarefas as t where t.finalizado = :paramFinalizado");
		query.setParameter("paramFinalizado", false);

		@SuppressWarnings("unchecked")
		List<Tarefas> lista = query.getResultList();

		for (Tarefas tarefa : lista) {
			System.out.println(tarefa.getDescricao());
		}
		manager.close();
	}
}
