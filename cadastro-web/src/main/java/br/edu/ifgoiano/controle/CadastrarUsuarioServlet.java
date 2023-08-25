package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.Usuario;
import br.edu.ifgoiano.repositorio.UsuarioRepositorio;

@WebServlet("/cadastrarUsuario")
public class CadastrarUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 7869758393435911873L;
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");
		
		//Verificar se as senhas são iguais
		if(senha1.equals(senha2)) {
			Usuario usu = new Usuario();
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(req.getParameter("senha1"));

			
			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			repositorio.inserirUsuario(usu);
			
			
			//redirecionar o usuário para a página de login
			resp.sendRedirect("index.html");
		}else {
			//redirecionar o usuário para a mesma página de cadastro do usuário.
			req.getRequestDispatcher("usuarioCadastro.jsp").forward(req, resp);
		}
		
		}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*for (Usuario usuario : lstDeUsuario) {
			System.out.println(usuario.getNome().concat(" - ").concat(usuario.getEmail()));
		}*/
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		
		
			req.setAttribute("usuarios", repositorio.listarUsuarios());
		
			req.getRequestDispatcher("usuarioListagem.jsp").forward(req, resp);
	}
	
	
}
