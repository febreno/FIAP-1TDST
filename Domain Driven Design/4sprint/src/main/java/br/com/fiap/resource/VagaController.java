package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.bo.VagaBO;
import br.com.fiap.bo.VagaService;
import br.com.fiap.to.UsuarioTO;
import br.com.fiap.to.VagaTO;

@Path("/vaga")
public class VagaController {
	
	VagaService vs = new VagaBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<VagaTO> buscar() {
		return vs.buscar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public VagaTO buscar(@PathParam("id") Long id) {
		return vs.buscar(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrarUsuario(VagaTO vaga, @Context UriInfo uriInfo) {

		vs.insert(vaga);		

		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path("Criado");
		
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(VagaTO vaga, @PathParam("id") Long id) {
		vaga.setIdVaga(id);
		vs.atualizar(vaga);
		return Response.ok().build();
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(VagaTO vaga) {
		vs.deletar(vaga);
	}
	
}
