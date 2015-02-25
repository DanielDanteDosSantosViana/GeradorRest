package br.com.geradorrest.domain;

import java.util.Date;

public class Nacionalidade {
	
	private boolean brasileiro;
	private Date dataNaturalizacao;
	
	public Nacionalidade (boolean brasileiro,Date dataNaturalizacao){
		this.brasileiro = brasileiro;
		this.dataNaturalizacao = dataNaturalizacao;
	}
	
	public Nacionalidade (){}
	
	public boolean isBrasileiro() {
		return brasileiro;
	}
	public void setBrasileiro(boolean brasileiro) {
		this.brasileiro = brasileiro;
	}
	public Date getDataNaturalizacao() {
		return dataNaturalizacao;
	}
	public void setDataNaturalizacao(Date dataNaturalizacao) {
		this.dataNaturalizacao = dataNaturalizacao;
	}
	
}
