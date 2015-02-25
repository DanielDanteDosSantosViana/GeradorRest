package br.com.geradorrest.domain;

public class NaturezaJuridica {
	
	private String id;
	private String descricaoNaturezaJuridicaBrasileira;
	private String descricaoNaturezaJuridicaEstrangeira;
	
	public NaturezaJuridica(){}
	
	public NaturezaJuridica(String id , String descricaoNaturezaJuridicaBrasileira , 
			String descricaoNaturezaJuridicaEstrangeira){
		
		this.descricaoNaturezaJuridicaBrasileira = descricaoNaturezaJuridicaBrasileira;
		this.descricaoNaturezaJuridicaEstrangeira = descricaoNaturezaJuridicaEstrangeira;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricaoNaturezaJuridicaBrasileira() {
		return descricaoNaturezaJuridicaBrasileira;
	}
	public void setDescricaoNaturezaJuridicaBrasileira(
			String descricaoNaturezaJuridicaBrasileira) {
		this.descricaoNaturezaJuridicaBrasileira = descricaoNaturezaJuridicaBrasileira;
	}
	public String getDescricaoNaturezaJuridicaEstrangeira() {
		return descricaoNaturezaJuridicaEstrangeira;
	}
	public void setDescricaoNaturezaJuridicaEstrangeira(
			String descricaoNaturezaJuridicaEstrangeira) {
		this.descricaoNaturezaJuridicaEstrangeira = descricaoNaturezaJuridicaEstrangeira;
	}
	
}
