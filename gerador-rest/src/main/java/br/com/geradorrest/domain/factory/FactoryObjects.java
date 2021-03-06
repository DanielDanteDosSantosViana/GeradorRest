package br.com.geradorrest.domain.factory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.geradorrest.domain.ControleAcesso;
<<<<<<< HEAD
=======
import br.com.geradorrest.domain.Documento;
import br.com.geradorrest.domain.DocumentoPessoa;
>>>>>>> 9c13615c8cb0149f0d2bcc20000dccb42e47a3d1
import br.com.geradorrest.domain.Endereco;
import br.com.geradorrest.domain.Grupo;
import br.com.geradorrest.domain.Municipio;
import br.com.geradorrest.domain.Nacionalidade;
import br.com.geradorrest.domain.NaturezaJuridica;
import br.com.geradorrest.domain.Pais;
import br.com.geradorrest.domain.Pessoa;
import br.com.geradorrest.domain.PessoaAssociada;
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
		Pais pais = new Pais(new Long(1),"BRASIL","BRA");

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

	public static PessoaFisica getPessoaFisicaPorCPF(String numeroCpf){
		
		
		Pais pais = new Pais(new Long(1),"BRASIL","BRA");
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
	
public static PessoaFisica getPessoaFisicaPorId(String id){
		
		
		Pais pais = new Pais(new Long(1),"BRASIL","BRA");
		Residencia residencia = new Residencia(false,new Date(),pais);
		Nacionalidade nacionalidade = new Nacionalidade(true,new Date());
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setId(id);
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
		Pais pais = new Pais(new Long(2),"ESTADOS UNIDOS","USA");
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setDataConstituicao(new Date());
		pessoaJuridica.setNome("DANIEL PROGRAMING");
		pessoaJuridica.setNomeFantasia("BRASIL PROGRAMING");
		pessoaJuridica.setNumeroAgenteEconomico("22448");
		pessoaJuridica.setNaturezaJuridica(naturezaJuridica);
		pessoaJuridica.setPais(pais);
		pessoaJuridica.setId("1111");
		
		return pessoaJuridica;
	}
	
public static PessoaJuridica getPessoaJuridicaPorId(String id) {
		
		NaturezaJuridica naturezaJuridica = new NaturezaJuridica(null,null,"Sociedade de quotas de responsabilidade limitada");
		Pais pais = new Pais(new Long(2),"ESTADOS UNIDOS","USA");
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setDataConstituicao(new Date());
		pessoaJuridica.setNome("DANIEL PROGRAMING");
		pessoaJuridica.setNomeFantasia("BRASIL PROGRAMING");
		pessoaJuridica.setNumeroAgenteEconomico("22448");
		pessoaJuridica.setNaturezaJuridica(naturezaJuridica);
		pessoaJuridica.setPais(pais);
		pessoaJuridica.setId(id);
		
		return pessoaJuridica;
	}
	
	public static List<Pais> obtemTodosPaises() {
		Pais paisBR = new Pais(new Long(1),"BRASIL","BR");
		Pais paisUSA = new Pais(new Long(2),"ESTADOS UNIDOS","USA");
		List<Pais> paises = new ArrayList<Pais>();
		paises.add(paisBR);
		paises.add(paisUSA);
		
		return paises;
	}

	public static Pais obtemTodasAsUnidadesDoPaisCadastrado(String idPais) {
		
		
		Unidade unidadeACRE = new Unidade(new Long(1),"ACRE","AC");
		Unidade unidadeTocantins = new Unidade(new Long(2),"TOCANTINS","TO");
		Unidade unidadeRio = new Unidade(new Long(5),"RIO DE JANEIRO","RJ");
		Unidade unidadeSaoPaulo = new Unidade(new Long(5),"SÃO PAULO","SP");
		Unidade unidadeBahia = new Unidade(new Long(5),"BAHIA","BH");
		
		List<Unidade> unidades = new ArrayList<Unidade>();
		unidades.add(unidadeTocantins);
		unidades.add(unidadeACRE);
		unidades.add(unidadeRio);
		unidades.add(unidadeSaoPaulo);
		unidades.add(unidadeBahia);
<<<<<<< HEAD
		
		
=======
		
		
>>>>>>> 9c13615c8cb0149f0d2bcc20000dccb42e47a3d1
		Pais pais = new Pais(new Long(idPais),idPais,idPais);
		pais.setUnidades(unidades);
		
		return pais;
	}

	public static Unidade obtemTodasOsMunicipiosCadastradosParaUnidadeIdentificada(
			String idUnidade) {

		Unidade unidadeACRE = new Unidade(new Long(idUnidade),"ACRE","AC");
		Municipio municipioRECIFE = new Municipio(new Long(415),"RECIFE" );
		Municipio municipioOLINDA = new Municipio(new Long(4316),"OLINDA" );
		Municipio municipioCamacar = new Municipio(new Long(2487),"CAMAÇAR" );
		
		List<Municipio> municipios = new ArrayList<Municipio>();
		municipios.add(municipioRECIFE);
		municipios.add(municipioOLINDA);
		municipios.add(municipioCamacar);
		
		unidadeACRE.setMunicipios(municipios);
		
		return unidadeACRE;
	}


	public static ControleAcesso obtemTodosOsGruposParaControleAcesso(){
		ControleAcesso controleAcesso = new ControleAcesso();
		
		Grupo grupo1 = new Grupo(new Long(5),"AGENTE PESSOA JURIDICA @ST4@","AGE",null);
		Grupo grupo2 = new Grupo(new Long(59),"USUARIO EXTERNO CONSULTA PUBLICA",null,null);
		
		List<Grupo> grupos = new ArrayList<Grupo>();
		grupos.add(grupo1);
		grupos.add(grupo2);
		
		controleAcesso.setGrupos(grupos);
		
		return controleAcesso;
	}
	
	public static Grupo obtemTodasPessoasPorGrupo(String idGrupo){
		
		
		Grupo grupo1 = new Grupo();
		
		PessoaAssociada pessoaAssociada1 = new PessoaAssociada(new Long(2766329), "LIVIA MARIA DE ALMEIDA PINTO");
		PessoaAssociada pessoaAssociada2 = new PessoaAssociada(new Long(2400202), "ADJAIR PEREIRA GOMES");
		
		List<PessoaAssociada> pessoaAssociadas = new ArrayList<PessoaAssociada>();
		pessoaAssociadas.add(pessoaAssociada1);
		pessoaAssociadas.add(pessoaAssociada2);
		
		grupo1.setPessoaAssociadas(pessoaAssociadas);
		grupo1.setId(new Long(idGrupo));
		
		return grupo1;
	}
<<<<<<< HEAD
=======
	
	public static DocumentoPessoa obterDocumentoPorIdPessoa(String idPessoa){
		
		Documento documento = new Documento();
		
		documento.setId("11111111111");
		documento.setDtEmissao(new Date().toString());
		Municipio municipio = new Municipio(new Long(2487), "Rio De Janeiro");
		Unidade unidade = new Unidade(new Long(5),"RIO DE JANEIRO","RJ");
		Pais pais = new Pais(new Long(1),"BRASIL","BRA");

		documento.setMunicipio(municipio);
		documento.setUnidade(unidade);
		documento.setPais(pais);
		documento.setTipo("CPF");
		
		Documento documentoCNPJ = new Documento();
		
		documentoCNPJ.setId("11111111111111");
		documentoCNPJ.setDtEmissao(new Date().toString());
		Municipio municipioCNPJ = new Municipio(new Long(2487), "Rio De Janeiro");
		Unidade unidadeCNPJ = new Unidade(new Long(5),"RIO DE JANEIRO","RJ");
		Pais paisCNPJ = new Pais(new Long(1),"BRASIL","BRA");

		documentoCNPJ.setMunicipio(municipioCNPJ);
		documentoCNPJ.setUnidade(unidadeCNPJ);
		documentoCNPJ.setPais(paisCNPJ);
		documentoCNPJ.setTipo("CNPJ");
		
		List<Documento> documentos = new ArrayList<Documento>();
		documentos.add(documento);
		documentos.add(documentoCNPJ);
		
		DocumentoPessoa documentoPessoa = new DocumentoPessoa();
		
		documentoPessoa.setDocumentos(documentos);
		documentoPessoa.setIdPessoa(idPessoa);
		
		return documentoPessoa;
	}

>>>>>>> 9c13615c8cb0149f0d2bcc20000dccb42e47a3d1
}
