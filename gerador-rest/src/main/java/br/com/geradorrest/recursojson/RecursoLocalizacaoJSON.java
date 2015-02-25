package br.com.geradorrest.recursojson;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.geradorrest.domain.Localizacao;
import br.com.geradorrest.domain.Pais;
import br.com.geradorrest.domain.Unidade;
import br.com.geradorrest.domain.factory.FactoryObjects;

@Path("localizacao")
public class RecursoLocalizacaoJSON {

	@Path("/pais")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Localizacao getTodosPaises(){
		try{
		
			List<Pais> paises = FactoryObjects.obtemTodosPaises();
			Localizacao localizacao = new Localizacao();
			localizacao.setPais(paises);
			return localizacao;
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
		return null;
		
	}

	@Path("/pais/{id_pais}/unidade")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Pais obtemTodasAsUnidadesDoPaisCadastrado(@PathParam("id_pais") String idPais){
		try{
		
			Pais pais = FactoryObjects.obtemTodasAsUnidadesDoPaisCadastrado(idPais);
			return pais;
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
		return null;
		
	}

	@Path("/unidade/{id_unidade}/municipio")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Unidade obtemTodasOsMunicipiosCadastradosParaUnidadeIdentificada(@PathParam("id_unidade") String idUnidade){
		try{
		
			Unidade unidade = FactoryObjects.obtemTodasOsMunicipiosCadastradosParaUnidadeIdentificada(idUnidade);
			return unidade;
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
		return null;
		
	}

	
}
