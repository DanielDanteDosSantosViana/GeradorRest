package br.com.geradorrest.recursojson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.geradorrest.domain.Client;


@Path("recursocliente")
public class RecursoClienteJSON {

	@GET
    @Path("cliente")
	@Produces(MediaType.APPLICATION_JSON)
    public Client getClient() {
		Client client = new Client("daniel","13197654757","viana");
		return client;
    }
}
