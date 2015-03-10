package br.com.geradorrest.service.dto;

import java.util.List;

import br.com.geradorrest.domain.Documento;

public class DocumentoPessoaDTO {

	private String idPessoa;
	private List<Documento> documentos;
	

	public String getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(String idPessoa) {
		this.idPessoa = idPessoa;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
}
