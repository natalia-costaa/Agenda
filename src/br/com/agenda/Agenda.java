package br.com.agenda;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contato> listaContatos = new ArrayList<Contato>();
	
	public void adicionarContato (Contato c) {
		this.listaContatos.add(c);
	}
		
	public boolean removerContato(Contato c) {
		if(listaContatos.contains(c)) {
			listaContatos.remove(c);
			return true;
		} else {
		return false;
		}
	}
	
	public Contato pesquisarContato(String nome) {
		for(Contato contato: listaContatos) {
			 if(contato.getNome().equalsIgnoreCase(nome)){
				return contato;
			 }
		}
		return null;		
	}
	
	public Contato pesquisarContato(String nome, String telefone) {
		for(Contato contato: listaContatos) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				return contato;
			}
		}
		for(Contato tel: listaContatos) {
				 if(tel.getTelefone().equalsIgnoreCase(telefone)) {
						return tel;
				 }
		}
		return null;
	}
		

	public boolean alterarContato(Contato c, Contato novo) {
		for(int i = 0; i < listaContatos.size(); i++) {
			if(listaContatos.get(i).equals(c)) {
				listaContatos.set(i, novo);
				}
			}
		if (listaContatos.contains(novo)) {
			return true;
		} else {
			return false;
		}
	}
		
		
	public int getQuantidade() {
		return listaContatos.size();
	}

	public ArrayList<Contato> getListaContatos() {
		return listaContatos;
	}


}