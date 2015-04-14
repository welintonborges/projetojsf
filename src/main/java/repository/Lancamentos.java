package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Lancamento;

public class Lancamentos {

	private EntityManager manager;

	public Lancamentos(EntityManager manager) {
		this.manager = manager;
	}

	public void adicionar(Lancamento lancamento) {
		this.manager.persist(lancamento);
	}

	public List<Lancamento> todos() {
		TypedQuery<Lancamento> query = manager.createQuery("from Lancamento",
				Lancamento.class);
		return query.getResultList();
	}
}
