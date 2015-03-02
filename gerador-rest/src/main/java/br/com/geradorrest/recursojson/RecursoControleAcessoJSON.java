package br.com.geradorrest.recursojson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.geradorrest.domain.ControleAcesso;
import br.com.geradorrest.domain.Grupo;
import br.com.geradorrest.domain.Unidade;
import br.com.geradorrest.domain.factory.FactoryObjects;

@Path("controleacesso")
public class RecursoControleAcessoJSON {

	@Path("/grupo")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public ControleAcesso getTodosOsGruposParaControleAcesso(){
		try{
		
			ControleAcesso controleAcesso = FactoryObjects.obtemTodosOsGruposParaControleAcesso();
			return controleAcesso ;
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
		return null;
		
	}

	@Path("/grupo/{id_grupo}/pessoa")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Grupo obtemTodasAsUnidadesDoPaisCadastrado(@PathParam("id_grupo") String idGrupo){
		try{
		
			Grupo grupo = FactoryObjects.obtemTodasPessoasPorGrupo(idGrupo);
			return grupo;
		
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
