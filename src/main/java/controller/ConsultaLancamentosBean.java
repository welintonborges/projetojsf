package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import model.Lancamento;
import repository.Lancamentos;
import util.JpaUtil;



@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean {

	private List<Lancamento> lancamentos;
	
	public void consultar(){
		
		EntityManager manager = JpaUtil.getEntityManager();
		Lancamentos lancamentos = new Lancamentos(manager);
		
		this.lancamentos = lancamentos.todos();
		manager.close();
	}
	public List<Lancamento> getLancamentos(){
		return lancamentos;
	}
}
