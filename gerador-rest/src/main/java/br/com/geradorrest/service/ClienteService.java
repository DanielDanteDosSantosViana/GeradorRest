package br.com.geradorrest.service;

import java.util.HashMap;

import br.com.geradorrest.protocolo.ProtocoloDeComunicacao;
import br.com.geradorrest.service.dto.ClientDTO;

public class ClienteService {
	
	private static final String BASE_URI = "http://localhost:3000/gerador-rest/myresource/client"; 
	
	public void getCliente(){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		ClientDTO cliente =(ClientDTO)ProtocoloDeComunicacao.httpGet(ClientDTO.class, BASE_URI,paramentrosDeBusca);
		System.out.println(cliente.getCpf());
	}	
}
