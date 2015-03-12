package br.com.geradorrest.domain;

import java.util.Date;

public class PessoaFisica {

	private String id;
	private String nome;
	private String nomeArtistico;
	private Date dataNascimento;
	private String numeroAgenteEconomico;
	private Nacionalidade nacionalidade;
	private Residencia residencia;
	
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
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroAgenteEconomico() {
		return numeroAgenteEconomico;
	}
	public void setNumeroAgenteEconomico(String numeroAgenteEconomico) {
		this.numeroAgenteEconomico = numeroAgenteEconomico;
	}
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Residencia getResidencia() {
		return residencia;
	}
	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	
}
