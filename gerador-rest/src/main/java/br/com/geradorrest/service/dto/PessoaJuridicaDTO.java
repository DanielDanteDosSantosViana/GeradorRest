package br.com.geradorrest.service.dto;

import java.util.Date;

import br.com.geradorrest.domain.NaturezaJuridica;
import br.com.geradorrest.domain.Pais;

public class PessoaJuridicaDTO {

	private String id;
	private String nome;
	private String nomeFantasia;
	private Date dataConstituicao;
	private String numeroAgenteEconomico;
	private NaturezaJuridica naturezaJuridica;
	private Pais pais;
	
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
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Date getDataConstituicao() {
		return dataConstituicao;
	}
	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}
	public String getNumeroAgenteEconomico() {
		return numeroAgenteEconomico;
	}
	public void setNumeroAgenteEconomico(String numeroAgenteEconomico) {
		this.numeroAgenteEconomico = numeroAgenteEconomico;
	}
	public NaturezaJuridica getNaturezaJuridica() {
		return naturezaJuridica;
	}
	public void setNaturezaJuridica(NaturezaJuridica naturezaJuridica) {
		this.naturezaJuridica = naturezaJuridica;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
