package br.com.caelum.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefas;

public class AdicionaTarefas {

	public static void main(String[] args) {

	    Tarefas tarefa = new Tarefas();
	    tarefa.setDescricao("Zicar as bibas");
	    tarefa.setFinalizado(true);
	    tarefa.setDataFinalizacao(Calendar.getInstance());

	    EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");	    
	    EntityManager manager = factory.createEntityManager();

	    manager.getTransaction().begin();    
	    manager.persist(tarefa);
	    manager.getTransaction().commit();  

	    System.out.println("ID da tarefa: " + tarefa.getId());
	    	    
	    manager.close();
	  }
	
}
