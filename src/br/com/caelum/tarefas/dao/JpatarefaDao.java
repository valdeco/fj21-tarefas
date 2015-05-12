package br.com.caelum.tarefas.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.caelum.tarefas.modelo.Tarefas;

@Repository
public class JpatarefaDao implements TarefaDao {
	
	@PersistenceContext
	  EntityManager manager;
	
	public void adiciona(Tarefas tarefa) {
	      manager.persist(tarefa);
	    }

	    public void altera(Tarefas tarefa) {
	      manager.merge(tarefa);
	    }

	    @SuppressWarnings("unchecked")
		public List<Tarefas> lista() {
	      return manager.createQuery("select t from Tarefas as t")
	        .getResultList();
	    }

	    public Tarefas buscaPorId(Long id) {
	      return manager.find(Tarefas.class, id);
	    }

	    public void remove(Tarefas tarefa) {
	      Tarefas tarefaARemover = buscaPorId(tarefa.getId());
	      manager.remove(tarefaARemover);
	    }

	    public void finaliza(Long id) {
	      Tarefas tarefa = buscaPorId(id);
	      tarefa.setFinalizado(true);
	      tarefa.setDataFinalizacao(Calendar.getInstance());
	    }

}
