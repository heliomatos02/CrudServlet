package br.com.crud.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private static int id = 1;
	
	static {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(id++);//++ � pos incremento, ou seja coloca um depois incrementa.
		pessoa.setNome("Alana");
		listaPessoas.add(pessoa);
		
		
		pessoa = new Pessoa();
		pessoa.setId(id++);
		pessoa.setNome("Ursula");
		listaPessoas.add(pessoa);
		
	}
	
	public boolean adiciona(Pessoa pessoa) {
		try {
			pessoa.setId(id++);
			Banco.listaPessoas.add(pessoa);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Pessoa> it = listaPessoas.iterator();
		
		while (it.hasNext()) {
			Pessoa pes = it.next();
			if(pes.getId() == id) {
				it.remove();
			}
		}
	}

	public Pessoa buscaEmpresaPeloId(Integer id) {
		Iterator<Pessoa> it = listaPessoas.iterator();
		while (it.hasNext()) {
			Pessoa pes = it.next();
			if(pes.getId() == id) {
				return pes;
			}
		}
		return null;
	}
	
	public List<Pessoa> getListaEmpresa() {
		return Banco.listaPessoas;
	}
}