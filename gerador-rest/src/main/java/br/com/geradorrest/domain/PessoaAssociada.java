package br.com.geradorrest.domain;

public class PessoaAssociada {

	private Long id;
	
	private String nome;
	
	

	public PessoaAssociada(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public PessoaAssociada(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
