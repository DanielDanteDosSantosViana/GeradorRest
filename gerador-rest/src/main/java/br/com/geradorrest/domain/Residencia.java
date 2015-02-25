package br.com.geradorrest.domain;

import java.util.Date;

public class Residencia {
	
	private boolean residenciaNoBrasil;
	private Date dataInicioResidenciaBrasil;
	private Pais pais;
	
	public Residencia(){}

	public Residencia(boolean residenciaNoBrasil ,
		Date dataInicioResidenciaBrasil, Pais pais){

		this.dataInicioResidenciaBrasil=dataInicioResidenciaBrasil;
		this.pais = pais;
		this.residenciaNoBrasil = residenciaNoBrasil;
	}
	
	public boolean isResidenciaNoBrasil() {
		return residenciaNoBrasil;
	}
	public void setResidenciaNoBrasil(boolean residenciaNoBrasil) {
		this.residenciaNoBrasil = residenciaNoBrasil;
	}
	public Date getDataInicioResidenciaBrasil() {
		return dataInicioResidenciaBrasil;
	}
	public void setDataInicioResidenciaBrasil(Date dataInicioResidenciaBrasil) {
		this.dataInicioResidenciaBrasil = dataInicioResidenciaBrasil;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	
}
