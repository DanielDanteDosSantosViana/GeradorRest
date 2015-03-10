package br.com.geradorrest.consumidor;

import java.util.List;

import br.com.geradorrest.service.PaisService;
import br.com.geradorrest.service.PessoaService;
import br.com.geradorrest.service.dto.DocumentoPessoaDTO;
import br.com.geradorrest.service.dto.PaisDTO;
import br.com.geradorrest.service.dto.PessoaDTO;
import br.com.geradorrest.service.dto.PessoaFisicaDTO;
import br.com.geradorrest.service.dto.PessoaJuridicaDTO;

public class ConsumidorDeServicos {

	public PessoaDTO consomePessoasEndereco(){
		return new PessoaService().getPessoaEnderecosPor("1");
		
	}

	public PessoaFisicaDTO consomePessoasFisica(){
		return new PessoaService().getPessoaFisicaPor("2073");
		
	}

	public PessoaJuridicaDTO consomePessoasJuridica(){
		return new PessoaService().getPessoaJuridicaPorNumeroCNPJ("2073");
		
	}
	
	public DocumentoPessoaDTO consomeDocumentoPessoa(){
		return new PessoaService().getDocumentoPessoaPorIdPessoa("1");
		
	}

	public static void main(String[] args) {
		ConsumidorDeServicos consumidor = new ConsumidorDeServicos();
		
		DocumentoPessoaDTO documentoPessoaDTO = consumidor.consomeDocumentoPessoa();
		PessoaDTO  pessoaDTO = consumidor.consomePessoasEndereco();
		PessoaFisicaDTO  pessoaFisicaDTO = consumidor.consomePessoasFisica();
		PessoaJuridicaDTO  pessoaJuridicaDTO = consumidor.consomePessoasJuridica();
		List<PaisDTO>  paises = consumidor.consomeTodosPaises();
		
		System.out.println(documentoPessoaDTO.getIdPessoa());
		System.out.println(pessoaDTO.getIdPessoa());
		System.out.println(pessoaFisicaDTO.getId());
		System.out.println(pessoaJuridicaDTO.getId());
		System.out.println(paises.size());
		
		
	}

	private List<PaisDTO> consomeTodosPaises() {
	
		return new PaisService().getTodosPaises();
	}
}
