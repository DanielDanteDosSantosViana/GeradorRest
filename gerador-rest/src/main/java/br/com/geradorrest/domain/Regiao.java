package br.com.geradorrest.domain;

public class Regiao {
	
	private Long id;
	private String nome;
	private String sigla;
	
	public Regiao(Long id , String nome , String sigla){
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public Regiao(){}
	
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
