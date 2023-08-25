package br.edu.ifgoiano.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.Usuario;
import br.edu.ifgoiano.repositorio.UsuarioRepositorio;


@WebServlet("/excluirUsuario")
public class ExcluirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		Usuario usuario = new Usuario(id);
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		repositorio.excluirUsuario(usuario);
		
		resp.sendRedirect("cadastrarUsuario");
		
	}


}