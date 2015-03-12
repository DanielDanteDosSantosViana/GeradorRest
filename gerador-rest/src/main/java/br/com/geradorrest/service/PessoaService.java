package br.com.geradorrest.service;

import java.util.HashMap;

import br.com.geradorrest.protocolo.ProtocoloDeComunicacao;
import br.com.geradorrest.service.dto.DocumentoPessoaDTO;
import br.com.geradorrest.service.dto.PessoaDTO;
import br.com.geradorrest.service.dto.PessoaFisicaDTO;
import br.com.geradorrest.service.dto.PessoaJuridicaDTO;

public class PessoaService extends Consumir{

	
	public PessoaService() {
		URIs.put("PessoaEnderecos","http://localhost:3000/gerador-rest/pessoa/{idPessoa}/endereco");
		URIs.put("PessoaFisica","http://localhost:3000/gerador-rest/pessoa/fisica/cpf/{numero_cpf}");
		URIs.put("PessoaJuridica","http://localhost:3000/gerador-rest/pessoa/juridica/cnpj/{numero_cnpj}");
		URIs.put("PessoaFisicaPorID","http://localhost:3000/gerador-rest/pessoa/fisica/{idPessoa}");
		URIs.put("PessoaJuridicaPorID","http://localhost:3000/gerador-rest/pessoa/juridica/{idPessoa}");
		URIs.put("TodosPaises","http://localhost:3000/gerador-rest/localizacao/pais");
		URIs.put("DocumentoPessoa","http://localhost:3000/gerador-rest/pessoa/{idPessoa}/documento");
		

	}
	
	public PessoaDTO getPessoaEnderecosPor(String idPessoa){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		paramentrosDeBusca.put("{idPessoa}", idPessoa);
		
		PessoaDTO pessoa = (PessoaDTO)ProtocoloDeComunicacao.httpGet(PessoaDTO.class, URIs.get("PessoaEnderecos"),paramentrosDeBusca);
		return pessoa;
	}

	public PessoaFisicaDTO getPessoaFisicaPor(String numeroCPF){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		paramentrosDeBusca.put("{numero_cpf}", numeroCPF);
		
		PessoaFisicaDTO pessoaFisica =(PessoaFisicaDTO)ProtocoloDeComunicacao.httpGet(PessoaFisicaDTO.class, URIs.get("PessoaFisica"),paramentrosDeBusca);
		return pessoaFisica;
	}

	public PessoaJuridicaDTO getPessoaJuridicaPorNumeroCNPJ(String numeroCNPJ){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		paramentrosDeBusca.put("{numero_cnpj}", numeroCNPJ);
		
		PessoaJuridicaDTO pessoaJuridica =(PessoaJuridicaDTO)ProtocoloDeComunicacao.httpGet(PessoaJuridicaDTO.class, URIs.get("PessoaJuridica"),paramentrosDeBusca);
		return pessoaJuridica;
	}
	
	public PessoaFisicaDTO getPessoaFisicaPorId(String idPessoa){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		paramentrosDeBusca.put("{idPessoa}", idPessoa);
		
		PessoaFisicaDTO pessoaFisica =(PessoaFisicaDTO)ProtocoloDeComunicacao.httpGet(PessoaFisicaDTO.class, URIs.get("PessoaFisicaId"),paramentrosDeBusca);
		return pessoaFisica;
	}

	public PessoaJuridicaDTO getPessoaJuridicaPorId(String idPessoa){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		paramentrosDeBusca.put("{idPessoa}", idPessoa);
		
		PessoaJuridicaDTO pessoaJuridica =(PessoaJuridicaDTO)ProtocoloDeComunicacao.httpGet(PessoaJuridicaDTO.class, URIs.get("PessoaJuridicaId"),paramentrosDeBusca);
		return pessoaJuridica;
	}


	public DocumentoPessoaDTO getDocumentoPessoaPorIdPessoa(String idPessoa){
		HashMap<String,String> paramentrosDeBusca = new HashMap<String,String>();
		paramentrosDeBusca.put("{idPessoa}", idPessoa);
		
		DocumentoPessoaDTO documentoPessoa = (DocumentoPessoaDTO)ProtocoloDeComunicacao.httpGet(DocumentoPessoaDTO.class, URIs.get("DocumentoPessoa"),paramentrosDeBusca);
		return documentoPessoa;
	}

}
