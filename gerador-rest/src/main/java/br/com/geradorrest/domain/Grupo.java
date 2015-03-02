package br.com.geradorrest.domain;

import java.util.List;


public class Grupo {

	private Long id;
	private String nome;
	private String papel;
	private String funcao;
	
	private List<PessoaAssociada> pessoaAssociadas;
	
	public Grupo() {
		
	}

	public Grupo(Long id, String nome, String papel, String funcao) {

		this.id = id;
		this.nome = nome;
		this.papel = papel;
		this.funcao = funcao;
	}
	
	
	public List<PessoaAssociada> getPessoaAssociadas() {
		return pessoaAssociadas;
	}

	public void setPessoaAssociadas(List<PessoaAssociada> pessoaAssociadas) {
		this.pessoaAssociadas = pessoaAssociadas;
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
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	
}
