package br.com.geradorrest.domain;

public class Client {

	private String name;
	private String cpf;
	private String lastName;
	
	public Client(String name, String cpf, String lastName){
		this.setName(name);
		this.setCpf(cpf);
		this.setLastName(lastName);
		
	}
	public Client(){

		
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
