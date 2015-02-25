package br.com.geradorrest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.geradorrest.protocolo.ProtocoloDeComunicacao;
import br.com.geradorrest.service.dto.PaisDTO;

public class PaisService {
	private static HashMap<String,String> URIs = new HashMap<String,String>();
	
	public PaisService(){
		URIs.put("TodosPaises","http://localhost:3000/gerador-rest/localizacao/pais");
	}
	public List<PaisDTO> getTodosPaises(){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		
		List<PaisDTO> paises =(List<PaisDTO>)ProtocoloDeComunicacao.httpGet(ArrayList.class, URIs.get("TodosPaises"),paramentrosDeBusca);
		return paises;
	}

}
