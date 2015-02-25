package br.com.geradorrest.service.dto;


public class ClientDTO {

	private String name;
	private String cpf;
	private String lastName;
	
	public ClientDTO(String name, String cpf, String lastName){
		this.name = name;
		this.cpf = cpf;
		this.lastName = lastName;
		
	}
	public ClientDTO(){

		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
