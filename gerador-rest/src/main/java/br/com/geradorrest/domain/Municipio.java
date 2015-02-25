package br.com.geradorrest.domain;

public class Municipio {
	
	private Long id;
	private String nome;
	
	public Municipio(Long id , String nome){
		this.id = id;
		this.nome = nome;
	}

	public Municipio(){}
	

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
