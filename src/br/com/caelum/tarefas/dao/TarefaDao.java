package br.com.caelum.tarefas.dao;

import java.util.List;
import br.com.caelum.tarefas.modelo.Tarefas;

public interface TarefaDao {

	Tarefas buscaPorId(Long id);
	List<Tarefas> lista();
	void adiciona(Tarefas t);
	void altera(Tarefas t);
	void remove(Tarefas t);
	void finaliza(Long id);
}
