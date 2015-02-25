package br.com.geradorrest.recursojson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.geradorrest.domain.Pessoa;
import br.com.geradorrest.domain.PessoaFisica;
import br.com.geradorrest.domain.PessoaJuridica;
import br.com.geradorrest.domain.factory.FactoryObjects;

@Path("pessoa")
public class RecursoPessoaJSON {

	@Path("/{idPessoa}/endereco")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Pessoa getPessoaEnderecos(@PathParam("idPessoa") String idPessoa){
		try{
			Pessoa pessoa = FactoryObjects.getPessoaEnderecosPor(idPessoa);
			return pessoa;
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		return null;
		
	}

	@Path("/fisica/cpf/{numero_cpf}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public PessoaFisica getPessoaFisicaPeloNumeroCPF(@PathParam("numero_cpf") String numeroCpf){
		try{
			PessoaFisica pessoaFisica = FactoryObjects.getPessoaFisicaPorCPF(numeroCpf);
			return pessoaFisica;
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		return null;
		
	}

	@Path("/juridica/cnpj/{numero_cnpj}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public PessoaJuridica getPessoaJuridicaPeloNumeroCNPJ(@PathParam("numero_cnpj") String numeroCnpj){
		try{
			PessoaJuridica pessoaJuridica = FactoryObjects.getPessoaJuridicaPorCNPJ(numeroCnpj);
			return pessoaJuridica;
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		return null;
		
	}
}
