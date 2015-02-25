package br.com.geradorrest.domain;

import java.util.List;


public class Pessoa {
	
	private String idPessoa;
	private List<Endereco> enderecos;

	public String getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(String idPessoa) {
		this.idPessoa = idPessoa;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


}
