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

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.bo.UsuarioService;
import br.com.fiap.to.UsuarioTO;

@Path("/usuario")
public class UsuarioController {
	
	UsuarioService us = new UsuarioBO();
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrarUsuario(UsuarioTO usuario, @Context UriInfo uriInfo) {

		// INSERIR NA BASE
		if (us.insert(usuario) == null) {
			return Response.status(400).build();
		}

		// CONSTRUIR O PATH DE RETORNO
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path("Criado");
		
		// RETORNA O PATH E O STATUS 201
		return Response.created(builder.build()).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UsuarioTO> buscar() {
		return us.buscar();
	}
	
	@GET
	@Path("/{usuario}")
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioTO buscar(@PathParam("usuario") String usuario ) {
		return us.buscar(usuario);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void excluir(UsuarioTO usuario) {
		us.deletar(usuario);
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(UsuarioTO usuario, @PathParam("id") Long id) {
		usuario.setIdUsuario(id);
		us.atualizar(usuario);
		return Response.ok().build();
	}
	
	@GET
	@Path("/valida/{codUsuario}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response validaSenha(UsuarioTO usuario) {
		
		 us.validaSenha(usuario);
		
		if (!us.validaSenha(usuario)) {
			return Response.status(401).build();
		}
		
		return Response.ok().build();
		
	}
}
