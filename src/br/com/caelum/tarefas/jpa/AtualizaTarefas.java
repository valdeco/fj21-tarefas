package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefas;

public class AtualizaTarefas {

	public static void main(String[] args) {

		Tarefas tarefa = new Tarefas();
		tarefa.setId((long) 2); // esse id já existe no banco
		tarefa.setDescricao("Amanhã é um novo dia");
		tarefa.setFinalizado(false);
		tarefa.setDataFinalizacao(null);

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();

		manager.close();
	}

}
