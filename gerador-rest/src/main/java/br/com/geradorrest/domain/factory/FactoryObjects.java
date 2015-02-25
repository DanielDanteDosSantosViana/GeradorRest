package br.com.geradorrest.domain.factory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.geradorrest.domain.Endereco;
import br.com.geradorrest.domain.Municipio;
import br.com.geradorrest.domain.Nacionalidade;
import br.com.geradorrest.domain.NaturezaJuridica;
import br.com.geradorrest.domain.Pais;
import br.com.geradorrest.domain.Pessoa;
import br.com.geradorrest.domain.PessoaFisica;
import br.com.geradorrest.domain.PessoaJuridica;
import br.com.geradorrest.domain.Regiao;
import br.com.geradorrest.domain.Residencia;
import br.com.geradorrest.domain.Unidade;

public class FactoryObjects {

	public static Pessoa getPessoaEnderecosPor(String idPessoa){
		
		
		Municipio municipio = new Municipio(new Long(2487), "CAMAÇARI");
		Unidade unidade = new Unidade(new Long(5),"BAHIA","BA");
		Regiao regiao = new Regiao(new Long(2),"NORDESTE","NE");
		Pais pais = new Pais("BRA","BRASIL","BRA");

		Endereco endereco = new Endereco();
		endereco.setBairro("CENTRO");
		endereco.setCep("42800000");
		endereco.setLogradouro("PC ABRANTES, 22 ­ 2º ANDAR");
		endereco.setComplemento("ED ABRANTES CENTER");
		endereco.setTipo("FISCAL");
		endereco.setIdEndereco(new Long(108632));
		
		endereco.setUnidade(unidade);
		endereco.setRegiao(regiao);
		endereco.setPais(pais);
		endereco.setMunicipio(municipio);
		 
		
		List<Endereco> enderecos = new ArrayList<>();
		enderecos.add(endereco);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setIdPessoa(idPessoa);
		pessoa.setEnderecos(enderecos);
		
		return pessoa;
	}

	public static PessoaFisica getPessoaFisicaPorCPF(String idPessoa){
		
		
		Pais pais = new Pais("BRA","BRASIL","BRA");
		Residencia residencia = new Residencia(false,new Date(),pais);
		Nacionalidade nacionalidade = new Nacionalidade(true,new Date());
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setId("2073");
		pessoaFisica.setNome("DANIEL DANTE DOS SANTOS VIANA");
		pessoaFisica.setNomeArtistico("DANTE");
		pessoaFisica.setDataNascimento(new Date());
		pessoaFisica.setNumeroAgenteEconomico("3689");
		pessoaFisica.setResidencia(residencia);
		pessoaFisica.setNacionalidade(nacionalidade);
		 
		
		
		
		return pessoaFisica;
	}

	public static PessoaJuridica getPessoaJuridicaPorCNPJ(String numeroCnpj) {
		
		NaturezaJuridica naturezaJuridica = new NaturezaJuridica(null,null,"Sociedade de quotas de responsabilidade limitada");
		Pais pais = new Pais("USA","ESTADOS UNIDOS","USA");
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setDataConstituicao(new Date());
		pessoaJuridica.setNome("DANIEL PROGRAMING");
		pessoaJuridica.setNomeFantasia("BRASIL PROGRAMING");
		pessoaJuridica.setNumeroAgenteEconomico("22448");
		pessoaJuridica.setNaturezaJuridica(naturezaJuridica);
		pessoaJuridica.setPais(pais);
		pessoaJuridica.setId(numeroCnpj);
		
		return pessoaJuridica;
	}

	public static List<Pais> obtemTodosPaises() {
		Pais paisUSA = new Pais("USA","ESTADOS UNIDOS","USA");
		Pais paisBR = new Pais("BR","BRASIL","BR");
		List<Pais> paises = new ArrayList<Pais>();
		paises.add(paisBR);
		paises.add(paisUSA);
		
		return paises;
	}

	public static Pais obtemTodasAsUnidadesDoPaisCadastrado(String idPais) {
		
		
		Unidade unidadeACRE = new Unidade(new Long(1),"ACRE","AC");
		Unidade unidadeTocantins = new Unidade(new Long(2),"TOCANTINS","TO");
		
		List<Unidade> unidades = new ArrayList<Unidade>();
		unidades.add(unidadeTocantins);
		unidades.add(unidadeACRE);
		
		Pais pais = new Pais(idPais,idPais,idPais);
		pais.setUnidades(unidades);
		
		return pais;
	}

	public static Unidade obtemTodasOsMunicipiosCadastradosParaUnidadeIdentificada(
			String idUnidade) {

		Unidade unidadeACRE = new Unidade(new Long(idUnidade),"ACRE","AC");
		Municipio municipioRECIFE = new Municipio(new Long(415),"RECIFE" );
		Municipio municipioOLINDA = new Municipio(new Long(4316),"OLINDA" );
		
		List<Municipio> municipios = new ArrayList<Municipio>();
		municipios.add(municipioRECIFE);
		municipios.add(municipioOLINDA);
		
		unidadeACRE.setMunicipios(municipios);
		
		return unidadeACRE;
	}


}
