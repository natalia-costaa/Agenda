package br.com.agenda;

public class Contato {
	
	private String nome;
	private Endereco endereco;
	private String telefone;
	private String email;
	
	public Contato() {
		
	}
	
	public Contato(String nome, Endereco endereco, String telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
		
	public Contato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [nome = " + nome + "\nendereco = " + endereco + "\ntelefone = " + telefone + "\nemail = " + email + "]";
	}
	
	
	

}
