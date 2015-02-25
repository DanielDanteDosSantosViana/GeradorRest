package br.com.geradorrest.service.dto;

import java.util.List;

import br.com.geradorrest.domain.Endereco;


public class PessoaDTO {
	
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
