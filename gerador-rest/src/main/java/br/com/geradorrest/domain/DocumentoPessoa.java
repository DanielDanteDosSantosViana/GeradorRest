package br.com.geradorrest.domain;

import java.util.List;

public class DocumentoPessoa {

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
