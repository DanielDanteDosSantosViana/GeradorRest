package br.com.geradorrest.domain;

import java.util.List;

public class Pais {
	
	private String id;
	private String nome;
	private String sigla;
	private List<Unidade> unidades;
	
	public Pais(String id , String nome , String sigla){
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
	}

	public Pais(){}

	public String getId() {
		return id;
	}
	public void setId(String id) {
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

	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}
	
}
